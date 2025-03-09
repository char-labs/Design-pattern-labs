package tech.design.patterns.presentation

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import tech.design.patterns.application.FilmingService
import tech.design.patterns.presentation.request.FilmingAnalysisRequest

@RestController
@RequestMapping("/filming")
class FilmingController(
    private val filmingService: FilmingService,
){
    @PostMapping("/analysis")
    fun analysis(
        @RequestParam("algorithm") algorithm: String,
    ): String = filmingService.analysisFilming(FilmingAnalysisRequest.to(algorithm))
}