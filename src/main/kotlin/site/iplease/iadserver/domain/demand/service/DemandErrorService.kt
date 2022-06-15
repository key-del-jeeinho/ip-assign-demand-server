package site.iplease.iadserver.domain.demand.service

import reactor.core.publisher.Mono
import site.iplease.iadserver.domain.demand.data.dto.IpAssignDemandErrorOnStatusDto

interface DemandErrorService {
    fun handle(demand: IpAssignDemandErrorOnStatusDto): Mono<Unit>
}
