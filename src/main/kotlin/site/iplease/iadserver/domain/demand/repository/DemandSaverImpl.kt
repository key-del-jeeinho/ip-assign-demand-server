package site.iplease.iadserver.domain.demand.repository

import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import site.iplease.iadserver.domain.demand.data.entity.Demand

@Component
class DemandSaverImpl(
    private val demandRepository: DemandRepository
): DemandSaver {
    override fun saveDemand(demand: Demand, id: Long): Mono<Demand> =
        demandRepository.save(demand.copy(identifier = id))
}