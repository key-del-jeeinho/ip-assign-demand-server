package site.iplease.iadserver.domain.demand.util

import reactor.core.publisher.Mono
import site.iplease.iadserver.domain.demand.data.dto.IpAssignDemandCancelErrorOnStatusDto
import site.iplease.iadserver.global.demand.data.message.IpAssignDemandCancelErrorOnStatusMessage

interface DemandCancelErrorOnStatusConverter {
    fun convert(message: IpAssignDemandCancelErrorOnStatusMessage): Mono<IpAssignDemandCancelErrorOnStatusDto>
}