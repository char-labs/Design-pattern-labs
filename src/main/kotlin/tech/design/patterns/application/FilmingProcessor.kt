package tech.design.patterns.application

import org.springframework.stereotype.Component
import tech.design.patterns.dao.FilmingRepository
import tech.design.patterns.domain.FilmingAlgorithm
import tech.design.patterns.presentation.request.FilmingAnalysisRequest

@Component
class FilmingProcessor(
    private val filmingRepository: FilmingRepository,
    private val filmingPolicyCondition: MutableList<FilmingPolicyCondition>,
){
    fun analysisProcess(request: FilmingAnalysisRequest): String {
        val filmings = filmingRepository.findAllById(request.algorithm)

        // 전략 패턴 사용
        val analyzedUseAlgorithm = routeFilmingAnalysisStrategy(request.algorithm)
            .analysisAlgorithm(filmings)

        return "$analyzedUseAlgorithm analysis completed"
    }

    // 전략 라우팅
    private fun routeFilmingAnalysisStrategy(
        algorithm: FilmingAlgorithm
    ): FilmingPolicyCondition {
        return filmingPolicyCondition.firstOrNull {
            it.support(algorithm)
        } ?: throw IllegalArgumentException("Unsupported algorithm")
    }
}