# Android Project 3 - We have Flixter at Home

Submitted by: **Angel L Garcia**

**Flixter** is a movie browsing app that allows users to browse movies currently playing in theaters.

Time spent: **10** hours spent in total

## Required Features

The following **required** functionality is completed:

- [ x ] **Make a request to [The Movie Database API's `now_playing`](https://developers.themoviedb.org/3/movies/get-now-playing) endpoint to get a list of current movies**
- [ x ] **Parse through JSON data and implement a RecyclerView to display all movies**
- [ x ] **Use Glide to load and display movie poster images**

The following **optional** features are implemented:

- [ x ] Improve and customize the user interface through styling and coloring
- [ ] Implement orientation responsivity
    - App should neatly arrange data in both landscape and portrait mode
- [ x ] Implement Glide to display placeholder graphics during loading
    - Note: this feature is difficult to capture in a GIF without throttling internet speeds.  Instead, include an additional screencap of your Glide code implementing the feature.  (<10 lines of code)

The following **additional** features are implemented:

- [ x ] Custom Icon
- [ x ] Extra view
- [ x ] Search Bar (currently not fully implemented, its 2am I'm tired)

Possible ones

- Trailers for popular movies are played automatically when the movie is selected (1 point).
  - When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
  - Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
- Add a play icon overlay to popular movies to indicate that the movie can be played (1 point).
- Show if the movie is currently in theaters or on what streaming services


## Video Walkthrough

Here's a walkthrough of implemented user stories:

![](./Animation2.gif)

## Notes

Describe any challenges encountered while building the app.

## License

    Copyright 2024 Detective Pikachu

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.