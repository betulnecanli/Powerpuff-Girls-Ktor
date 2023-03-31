#  <h1 align="center">💗 Powerpuff Girls Server</h1>

<p align="center">  
 This project shows usage of Kotlin library ktor: Simple REST Server exposing JSON API for Powerpuff Girls entities. 
</p>
<p align="center">
<img src="https://github.com/betulnecanli/PowerpuffGirlsServer/blob/master/banner/ppgbnnr.png?raw=true"/>
</p>

</br>
<h2 align="center">How to run? 🚀</h2>
<p align="center"> 
After the download the project, you can open it with Intellij Idea. 
You can run the project on Application.kt file.
This server responds at http://127.0.0.1:8080.
You can use Postman for requests and responses.
</p>

# <h2 align="center">Endpoints📜</h2>
## Show All Characters 
- Method : GET
- Endpoint : /powerpuffgirls/characters
- Request : localhost:8080/powerpuffgirls/characters
- Response : 
```json 
...
{
    {
    "success": true,
    "message": "OK",
    "prevPage": null,
    "nextPage": 2,
    "ppGirls": [
        {
            "id": 1,
            "name": "Bubbles",
            "image": "/image/bubbles.jpg",
            "species": "Chemical X offspring of sugar, spice, and everything nice",
            "about": "Bubbles is one of the three main protagonists of the animated television series The Powerpuff Girls. She fights crime with her sisters Blossom and Buttercup. She is the Joy and the Laughter; she is the emotional glue of the superhero trio. She is the \"sugar\" ingredient of the three."
        },
        {
            "id": 2,
            "name": "Blossom",
            "image": "/image/blossom.jpg",
            "species": "Chemical X offspring of sugar, spice, and everything nice",
            "about": "Blossom is one of the three main protagonists of the animated television series The Powerpuff Girls, along with her sisters Bubbles and Buttercup. She's the Commander and Leader; she's the bright but egocentric leader of the superhero trio."
        },
        {
            "id": 3,
            "name": "Buttercup",
            "image": "/image/buttercup.jpg",
            "species": "Chemical X offspring of sugar, spice, and everything nice",
            "about": "Buttercup is one of the three main protagonists of the animated television series The Powerpuff Girls, along with her sisters Blossom and Bubbles. She's the Toughest Fighter; she's the bravest, most headstrong of the superhero trio."
        }
    ]
}
...
```
## Search Characters 
- Method : GET
- Endpoint : /powerpuffgirls/characters/search?name=
- Request : localhost:8080/powerpuffgirls/characters/search?name=bu
- Response : 
```json 
...
{
    "success": true,
    "message": "OK",
    "prevPage": null,
    "nextPage": null,
    "ppGirls": [
        {
            "id": 1,
            "name": "Bubbles",
            "image": "/image/bubbles.jpg",
            "species": "Chemical X offspring of sugar, spice, and everything nice",
            "about": "Bubbles is one of the three main protagonists of the animated television series The Powerpuff Girls. She fights crime with her sisters Blossom and Buttercup. She is the Joy and the Laughter; she is the emotional glue of the superhero trio. She is the \"sugar\" ingredient of the three."
        },
        {
            "id": 3,
            "name": "Buttercup",
            "image": "/image/buttercup.jpg",
            "species": "Chemical X offspring of sugar, spice, and everything nice",
            "about": "Buttercup is one of the three main protagonists of the animated television series The Powerpuff Girls, along with her sisters Blossom and Bubbles. She's the Toughest Fighter; she's the bravest, most headstrong of the superhero trio."
        },
        {
            "id": 12,
            "name": "Bunny",
            "image": "/image/bunny.jpg",
            "species": "Chemical X offspring of artificial sweetener, dirt, twigs, and everything nice",
            "about": "Bunny is one of the created, short-lived sisters of the Powerpuff Girls. She is shown only once in \"Twisted Sister\". The Powerpuff Girls each have a unique ingredient for her; sugar, spice, and everything nice. Just as each of the other Powerpuff Girls has a signature color, hers is lilac."
        },
        {
            "id": 15,
            "name": "Butch",
            "image": "/image/butch.jpg",
            "species": "Chemical X offspring of snips, snails, and a puppy dog’s tail",
            "about": "Butch is the third member of The Rowdyruff Boys. He is Buttercup's male equivalent and evil counterpart and was originally created by Mojo Jojo.After being killed by the Powerpuff Girls' kiss of death, he was revived by HIM and was given a cootie shot to prevent the same mistake to be repeated. While Buttercup's color is bottle green, Butch is more like a forest green. Butch's element is \"Snails\"."
        }
    ]
}
...
```
<h2 align="center">Tech Stack 📚</h2>

- [Kotlin](https://kotlinlang.org/) based,
- [Ktor Framework](https://ktor.io/docs/welcome.html) 
- [Koin](https://insert-koin.io/) for dependency injection.

# License
```xml
Designed and developed by 2023 Betül Necanlı 

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

