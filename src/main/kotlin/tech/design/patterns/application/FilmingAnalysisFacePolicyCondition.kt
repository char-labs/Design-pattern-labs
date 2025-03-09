package tech.design.patterns.application

import org.springframework.stereotype.Component
import tech.design.patterns.domain.Filming
import tech.design.patterns.domain.FilmingAlgorithm

@Component
class FilmingAnalysisFacePolicyCondition: FilmingPolicyCondition {
    override fun support(filmingAlgorithm: FilmingAlgorithm): Boolean {
        return filmingAlgorithm == FilmingAlgorithm.FACE
    }

    override fun analysisAlgorithm(
        filmings: List<Filming>,
    ): String {
        filmings.forEach{
            verifyAlgorithmFace(it)
            verifyAlgorithmFrameUrl(it)
        }
        return "Face"
    }

    private fun verifyAlgorithmFace(it: Filming) {
        if (it.algorithm != FilmingAlgorithm.FACE) {
            throw IllegalArgumentException("Algorithm is not Face")
        }
    }

    private fun verifyAlgorithmFrameUrl(it: Filming) {
        if (!it.frameUrl.contains(it.algorithm.name.lowercase())) {
            throw IllegalArgumentException("Frame URL is unmatched Algorithm")
        }
    }
}