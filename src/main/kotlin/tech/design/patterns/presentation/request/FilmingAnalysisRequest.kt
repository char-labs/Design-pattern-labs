package tech.design.patterns.presentation.request

import tech.design.patterns.domain.FilmingAlgorithm

data class FilmingAnalysisRequest(
    val algorithm: FilmingAlgorithm,
) {
    companion object {
        fun to(algorithm: String): FilmingAnalysisRequest {
            return FilmingAnalysisRequest(
                algorithm = FilmingAlgorithm.valueOf(algorithm)
            )
        }
    }
}
