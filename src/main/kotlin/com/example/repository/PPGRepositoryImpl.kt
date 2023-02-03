package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Characters


const val NEXT_PAGE_KEY = "nextPage"
const val PREV_PAGE_KEY = "prevPage"
class PPGRepositoryImpl(

) : PPGRepository {
    override val chars: Map<Int, List<Characters>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }
    override val page1: List<Characters> = listOf(
        Characters(
            id = 1,
            name = "Bubbles",
            image = "",
            species = "",
            about = ""
        ),
        Characters(
            id = 2,
            name = "Blossom",
            image = "",
            species = "",
            about = ""
        ),
        Characters(
            id = 3,
            name = "Buttercup",
            image = "",
            species = "",
            about = ""
        )

    )
    override val page2: List<Characters> = listOf(
        Characters(
            id = 4,
            name = "",
            image = "",
            species = "",
            about = ""
        ),
        Characters(
            id = 5,
            name = "",
            image = "",
            species = "",
            about = ""
        ),
        Characters(
            id = 6,
            name = "",
            image = "",
            species = "",
            about = ""
        )
    )
    override val page3: List<Characters> = listOf(
        Characters(
            id = 7,
            name = "",
            image = "",
            species = "",
            about = ""
        ),
        Characters(
            id = 8,
            name = "",
            image = "",
            species = "",
            about = ""
        ),
        Characters(
            id = 9,
            name = "",
            image = "",
            species = "",
            about = ""
        )
    )
    override val page4: List<Characters> = listOf(
        Characters(
            id = 10,
            name = "",
            image = "",
            species = "",
            about = ""
        ),
        Characters(
            id = 11,
            name = "",
            image = "",
            species = "",
            about = ""
        ),
        Characters(
            id = 12,
            name = "",
            image = "",
            species = "",
            about = ""
        )
    )

    override val page5: List<Characters> = listOf(
        Characters(
            id = 13,
            name = "",
            image = "",
            species = "",
            about = ""
        ),
        Characters(
            id = 14,
            name = "",
            image = "",
            species = "",
            about = ""
        ),
        Characters(
            id = 15,
            name = "",
            image = "",
            species = "",
            about = ""
        )
    )
    override suspend fun getAllCharacters(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            prevPage = calculatePage(page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page)[NEXT_PAGE_KEY],
            ppGirls = chars[page]!!
        )
    }

    private fun calculatePage(page : Int) : Map<String,Int?>{
        var prevPage: Int? = page
        var nextPage: Int? = page
        if(page in 1..4){
            nextPage = nextPage?.plus(1)
        }
        if(page in 2..5){
            prevPage = prevPage?.minus(1)
        }
        if(page == 1){
            prevPage = null
        }
        if (page == 5){
            nextPage = null
        }
        return mapOf(PREV_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchCharacters(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            ppGirls = findCharacters(name)
        )
    }

    private fun findCharacters(name : String?): List<Characters>{
        val founded = mutableListOf<Characters>()
        return if(!name.isNullOrEmpty()){
            chars.forEach{(_, chars) ->
                chars.forEach{ char ->
                    if(char.name.lowercase().contains(name.lowercase())){
                        founded.add(char)
                    }
                }
            }
            founded
        }
        else{
            emptyList()
        }
    }

}