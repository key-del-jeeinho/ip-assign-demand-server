package site.iplease.iadserver.domain.demand.util

import reactor.core.publisher.Mono
import site.iplease.iadserver.domain.demand.data.type.DemandPolicyType

interface DemandPolicyValidator {
    fun validate(demandId: Long, accountId: Long, vararg policy: DemandPolicyType): Mono<Unit>
}