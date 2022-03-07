# Flix

- [x] (8pts) Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.
- [x] (2pts) Allow video posts to be played in full-screen using the YouTubePlayerView.

#### BONUS

- [-] Implement a shared element transition when user clicks into the details of a movie (1 point).
- [-] Trailers for popular movies are played automatically when the movie is selected (1 point).
- [-] When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
- [-] Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
- [-] Add a play icon overlay to popular movies to indicate that the movie can be played (1 point).
- [-] Apply data binding for views to help remove boilerplate code. (1 point)
- [-] Add a rounded corners for the images using the Glide transformations. (1 point)

### App Walkthough GIF

`TODO://` Add the URL to your animated app walkthough `gif` in the image tag below, `YOUR_GIF_URL_HERE`. Make sure the gif actually renders and animates when viewing this README. (🚫 Remove this paragraph after after adding gif)

<img src="https://github.com/hassan-ibra/FlixsterMovieApp/blob/master/ezgif-1-5590aa28f4.gif" width=250><br>

---

## Flix Part 1

### User Stories
This is first part of a cloned Flixster app movie, where people often search on the app whats trending on the movie theatre and to check which are highly rated movies. This first part of the app I just Got the API and parsed to my project and designed a little UI that you can see the top movies trending. You are able to see the top trending movies with a visual Image and also a little description about the movie.

#### REQUIRED (10pts)
- [ x] (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS
- [x ] (2pts) Views should be responsive for both landscape/portrait mode.
   - [ x] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [ x] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.

- [x ] (2pts) Display a nice default [placeholder graphic](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
- [ x] (2pts) Improved the user interface by experimenting with styling and coloring.
- [ -] (2pts) For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous RecyclerViews and use different ViewHolder layout files for popular movies and less popular ones.

### App Walkthough GIF
 <img src="https://github.com/hassan-ibra/FlixsterMovieApp/blob/master/flixsteAppGIF.gif" width=500><br>



### Notes
It was interestinng Building this MovieApp, One of the biggest challenges was the emulator crashing down every few seconds after I opened and Also the Gradle.build file dependacy that was copied Didnt work at first due to the updated version of Android studio.

### Open-source libraries used
https://courses.codepath.org/courses/android_university_kotlin/pages/submitting_assignments
https://stackoverflow.com/questions/34341808/is-there-a-way-to-add-a-gif-to-a-markdown-file

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids
