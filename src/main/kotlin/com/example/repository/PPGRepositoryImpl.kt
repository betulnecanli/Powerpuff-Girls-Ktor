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
            image = "/image/bubbles.jpg",
            species = "Chemical X offspring of sugar, spice, and everything nice",
            about = "Bubbles is one of the three main protagonists of the animated television series The Powerpuff Girls." +
                    " She fights crime with her sisters Blossom and Buttercup. She is the Joy and the Laughter; " +
                    "she is the emotional glue of the superhero trio. She is the \"sugar\" ingredient of the three."
        ),
        Characters(
            id = 2,
            name = "Blossom",
            image = "/image/blossom.jpg",
            species = "Chemical X offspring of sugar, spice, and everything nice",
            about = "Blossom is one of the three main protagonists of the animated television series The Powerpuff Girls," +
                    " along with her sisters Bubbles and Buttercup. She's the Commander and Leader;" +
                    " she's the bright but egocentric leader of the superhero trio."
        ),
        Characters(
            id = 3,
            name = "Buttercup",
            image = "/image/buttercup.jpg",
            species = "Chemical X offspring of sugar, spice, and everything nice",
            about = "Buttercup is one of the three main protagonists of the animated television series The Powerpuff Girls, " +
                    "along with her sisters Blossom and Bubbles. She's the Toughest Fighter; " +
                    "she's the bravest, most headstrong of the superhero trio."
        )

    )
    override val page2: List<Characters> = listOf(
        Characters(
            id = 4,
            name = "Professor Utonium",
            image = "/image/professor",
            species = "Human",
            about = "Professor Utonium is the scientist responsible for creating The Powerpuff Girls and " +
                    "the tritagonist of the series. He teaches classes in quantum physics and " +
                    "micro-nuclear fusion at Townsville Research Center."
        ),
        Characters(
            id = 5,
            name = "The Mayor of Townsville",
            image = "/image/mayor.jpg",
            species = "Human",
            about = "The Mayor of Townsville (voiced by Tom Kenny), a.k.a. Mayor is a primary character " +
                    "whose main role in the show is calling the Powerpuff Girls if trouble wreaks havoc over the town," +
                    " but this is not always the case as he sometimes has a bad habit of asking them to help him" +
                    " with some trivial problem, such as opening a normal jar of pickles."
        ),
        Characters(
            id = 6,
            name = "Sara Bellum",
            image = "/image/sarabellum.jpg",
            species = "Human",
            about = "Ms. Sara Bellum is a character in the Cartoon Network animated series The Powerpuff Girls. " +
                    "She is voiced by Jennifer Martin. " +
                    "Most of fans never see her face until she is revealed as a full body."
        )
    )
    override val page3: List<Characters> = listOf(
        Characters(
            id = 7,
            name = "Him",
            image = "/image/him.jpg",
            species = "Devil",
            about = "HIM is a powerful, flamboyant devil who is the king of darkness, other devils," +
                    " other demons and other ghosts. He is also, by far, the most the dangerous enemy " +
                    "of the Powerpuff Girls and the most evil."
        ),
        Characters(
            id = 8,
            name = "Sedusa ",
            image = "/image/sakiko.jpg",
            species = "Human",
            about = "Sedusa is a beautiful mistress supervillain gorgon of disguise," +
                    " and a recurring antagonist for seductress who uses her feminine wiles and" +
                    " quick wits to influence men to do her bidding and an enemy of the Powerpuff Girls. "
        ),
        Characters(
            id = 9,
            name = "Mojo Jojo",
            image = "/image/mojojojo.jpg",
            species = "Mutant Chimpanzee",
            about = "Mojo Jojo is the main antagonist of the Cartoon Network television series, " +
                    "The Powerpuff Girls and the archenemy of the Powerpuff Girls. " +
                    "He also serves as the main antagonist of The Powerpuff Girls Movie."
        )
    )
    override val page4: List<Characters> = listOf(
        Characters(
            id = 10,
            name = "Blisstina Utonium",
            image = "/image/blistina.jpg",
            species = "Chemical W offspring of sugar, spice, and everything nice, Human",
            about = "Blisstina \"Bliss\" Francesca Francia Mariam Alicia Utonium is the older sister of the 2016 " +
                    "Powerpuff Girls and the first known living creation of Professor Utonium, appearing in the 2016" +
                    " Powerpuff Girls reboot. She debuted in Power of Four as the fourth Powerpuff Girl."
        ),
        Characters(
            id = 11,
            name = "Fuzzy Lumpkins",
            image = "/image/fuzzylumpkins.jpg",
            species = "Bear-like hillbilly monster",
            about = "Fuzzy Lumpkins is the tertiary antagonist of the original series. " +
                    "He has a \"hillbilly drawl\" and is very lazy. He does nothing for most of his life " +
                    "and lives in the woods quite a distance from Townsville. " +
                    "However, he is quite musical, as he enjoys playing his banjo (Joe), " +
                    "and he also has some cooking talents, such as making meat jam."
        ),
        Characters(
            id = 12,
            name = "Bunny",
            image = "/image/bunny.jpg",
            species = "Chemical X offspring of artificial sweetener, dirt, twigs, and everything nice",
            about = "Bunny is one of the created, short-lived sisters of the Powerpuff Girls. " +
                    "She is shown only once in \"Twisted Sister\". " +
                    "The Powerpuff Girls each have a unique ingredient for her; " +
                    "sugar, spice, and everything nice. " +
                    "Just as each of the other Powerpuff Girls has a signature color, hers is lilac."
        )
    )

    override val page5: List<Characters> = listOf(
        Characters(
            id = 13,
            name = "Brick",
            image = "/image/brick.jpg",
            species = "Chemical X offspring of snips, snails, and a puppy dog’s tail",
            about = "Brick is the male equivalent and the evil counterpart of Blossom. " +
                    "He is the leader of the Rowdyruff Boys and was originally created by Mojo Jojo. " +
                    "After being killed by the Powerpuff Girls' kiss of death, " +
                    "he was revived by HIM and was given a cootie shot to " +
                    "prevent the same mistake to be repeated. Opposed to Blossom's feminine color pink," +
                    " Brick's color is a masculine fire engine red. His key element is \"Puppy Dog's Tail.\"" +
                    " He is Blossom's arch-rival."
        ),
        Characters(
            id = 14,
            name = "Boomer",
            image = "/image/boomer.jpg",
            species = "Chemical X offspring of snips, snails, and a puppy dog’s tail",
            about = "Boomer is the blond-haired, blue-eyed member of The Rowdyruff Boys. " +
                    "He is Bubbles' male equivalent and evil counterpart " +
                    "and was originally created by Mojo Jojo. " +
                    "After being killed by the Powerpuff Girls' kiss of death," +
                    " he was revived by HIM and was given a cootie shot to prevent " +
                    "the same mistake to be repeated. As opposed to Bubbles' color sky blue, " +
                    "Boomer's is more like a cobalt blue. His key element is \"Snips\"."
        ),
        Characters(
            id = 15,
            name = "Butch",
            image = "/image/butch.jpg",
            species = "Chemical X offspring of snips, snails, and a puppy dog’s tail",
            about = "Butch is the third member of The Rowdyruff Boys. " +
                    "He is Buttercup's male equivalent and evil counterpart and was originally created by Mojo Jojo." +
                    "After being killed by the Powerpuff Girls' kiss of death, " +
                    "he was revived by HIM and was given a cootie shot to prevent the same mistake to be repeated." +
                    " While Buttercup's color is bottle green, Butch is more like a forest green." +
                    " Butch's element is \"Snails\"."
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