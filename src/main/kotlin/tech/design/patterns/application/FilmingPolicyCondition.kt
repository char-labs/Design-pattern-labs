package tech.design.patterns.application

import tech.design.patterns.domain.Filming
import tech.design.patterns.domain.FilmingAlgorithm

interface FilmingPolicyCondition {
    fun support(filmingAlgorithm: FilmingAlgorithm): Boolean

    fun analysisAlgorithm(
        filmings: List<Filming>,
    ): String
}