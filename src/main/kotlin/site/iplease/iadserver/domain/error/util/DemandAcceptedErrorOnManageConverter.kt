package site.iplease.iadserver.domain.error.util

import reactor.core.publisher.Mono
import site.iplease.iadserver.global.accept.data.message.IpAssignDemandAcceptedErrorOnManageMessage
import site.iplease.iadserver.global.error.data.dto.DemandAcceptedErrorOnManageDto

interface DemandAcceptedErrorOnManageConverter {
    fun convert(message: IpAssignDemandAcceptedErrorOnManageMessage): Mono<DemandAcceptedErrorOnManageDto>
}
