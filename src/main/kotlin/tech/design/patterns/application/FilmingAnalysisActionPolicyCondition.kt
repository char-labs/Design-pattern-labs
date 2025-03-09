package tech.design.patterns.application

import org.springframework.stereotype.Component
import tech.design.patterns.domain.Filming
import tech.design.patterns.domain.FilmingAlgorithm

@Component
class FilmingAnalysisActionPolicyCondition: FilmingPolicyCondition {
    override fun support(filmingAlgorithm: FilmingAlgorithm): Boolean {
        return filmingAlgorithm == FilmingAlgorithm.ACTION
    }

    override fun analysisAlgorithm(
        filmings: List<Filming>,
    ): String {
        filmings.forEach{
            verifyAlgorithmAction(it)
            verifyAlgorithmFrameUrl(it)
        }
        return "Action"
    }

    private fun verifyAlgorithmAction(it: Filming) {
        if (it.algorithm != FilmingAlgorithm.ACTION) {
            throw IllegalArgumentException("Algorithm is not Action")
        }
    }

    private fun verifyAlgorithmFrameUrl(it: Filming) {
        if (!it.frameUrl.contains(it.algorithm.name.lowercase())) {
            throw IllegalArgumentException("Frame URL is unmatched Algorithm")
        }
    }
}