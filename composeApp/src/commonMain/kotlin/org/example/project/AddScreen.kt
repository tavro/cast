/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package org.example.project

/*
TODO: Implement Add Movie Screen + Behaviour

- Initially Shown Fields: MovieTitle, StartTime, FinishTime (autofill + optional)
- When user fills in title:
    - If movie exists in IMDB, show (top five results) in dropdown
        - When clicked, autofill data
    - If movie does not exists in IMDB, show alternative to add manually
        - When clicked, show fields:
            - CoverImageUrl,
            - LengthInMinutes,
            - Director/Directors (comma separated)
            - Actors (dynamically added fields + optional)
- When user clicks 'Add movie'-button:
    - Fetch Directors and Actors data and create instances
    - Create Instance of movie
    - Create ViewingSession instance
 */
