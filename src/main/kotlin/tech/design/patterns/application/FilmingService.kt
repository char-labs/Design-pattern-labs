package tech.design.patterns.application

import org.springframework.stereotype.Service
import tech.design.patterns.presentation.request.FilmingAnalysisRequest

@Service
class FilmingService(
    private val filmingProcessor: FilmingProcessor,
) {
    fun analysisFilming(request: FilmingAnalysisRequest): String =
        filmingProcessor.analysisProcess(request)
}