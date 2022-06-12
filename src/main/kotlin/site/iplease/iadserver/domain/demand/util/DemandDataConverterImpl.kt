package site.iplease.iadserver.domain.demand.util

import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono
import site.iplease.iadserver.domain.demand.data.dto.DemandDto
import site.iplease.iadserver.domain.demand.data.entity.Demand
import site.iplease.iadserver.global.demand.data.message.IpAssignDemandCreateMessage
import site.iplease.iadserver.domain.demand.data.request.AssignIpDemandRequest

@Component
class DemandDataConverterImpl: DemandDataConverter {
    override fun toDto(accountId: Long, request: AssignIpDemandRequest): Mono<DemandDto>  =
        Unit.toMono().map { DemandDto(
            issuerId = accountId,
            title = request.title,
            description = request.description,
            usage = request.usage,
            expireAt = request.expireAt
        ) }

    override fun toDto(entity: Demand): Mono<DemandDto> =
        entity.toMono().map { DemandDto(
                id = it.id,
                issuerId = it.issuerId,
                title = it.title,
                description = it.description,
                usage = it.usage,
                expireAt = it.expireAt
            ) }

    override fun toEntity(dto: DemandDto): Mono<Demand> =
        dto.toMono().map { Demand(
                id = it.id,
                issuerId = it.issuerId,
                title = it.title,
                description = it.description,
                usage = it.usage,
                expireAt = it.expireAt
            ) }

    override fun toIpAssignDemandCreateMessage(demand: DemandDto): Mono<IpAssignDemandCreateMessage> =
        demand.toMono().map { IpAssignDemandCreateMessage(
            demandId = demand.id,
            issuerId = demand.issuerId
        ) }
}