package tech.design.patterns.application

import org.springframework.stereotype.Component
import tech.design.patterns.domain.Filming
import tech.design.patterns.domain.FilmingAlgorithm

@Component
class FilmingAnalysisScenePolicyCondition: FilmingPolicyCondition {
    override fun support(filmingAlgorithm: FilmingAlgorithm): Boolean {
        return filmingAlgorithm == FilmingAlgorithm.SCENE
    }

    override fun analysisAlgorithm(
        filmings: List<Filming>,
    ): String {
        filmings.forEach{
            verifyAlgorithmScene(it)
            verifyAlgorithmFrameUrl(it)
        }
        return "Scene"
    }

    private fun verifyAlgorithmScene(it: Filming) {
        if (it.algorithm != FilmingAlgorithm.SCENE) {
            throw IllegalArgumentException("Algorithm is not Scene")
        }
    }

    private fun verifyAlgorithmFrameUrl(it: Filming) {
        if (!it.frameUrl.contains(it.algorithm.name.lowercase())) {
            throw IllegalArgumentException("Frame URL is unmatched Algorithm")
        }
    }
}