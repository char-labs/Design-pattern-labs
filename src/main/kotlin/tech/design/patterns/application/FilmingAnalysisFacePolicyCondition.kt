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
        return "Face"
    }
}