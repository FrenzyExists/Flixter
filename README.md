# Lab 3: NY Times Bestselling Books

## Overview

You’ve been asked by NY Times to design a simple app to see the current best selling books of the week, based on their website:

![](https://imgur.com/1nPTG7C.png)

Their developers have already created some foundation for the app, but the networking isn't working and it doesn’t look very good so far. This is a big job, so you'll have to apply all your skills in Layouts, RecyclerView, and API calls!

## Required Features

The core requirements are to create an app that allows the user to scroll through a list of books. They should be able to see the book's ranking, cover, title, author, and description.

![](https://courses.codepath.org/course_images/and102/lab_3/required_features.gif)

## Stretch Features

The formatting and layout of the app have been improved, using View styling to better match the NY Times website. The "buy" button opens the book's Amazon listing.

![](https://courses.codepath.org/course_images/and102/lab_3/stretch_features.gif)

## 🎯 Goals

By the end of this lab you will be able to...

- Request data from an API
- Parse data into a Kotlin model
- Bind data to View objects
- Style Views and arrange them using ConstraintLayout

## Application Features

### Required Features
- Live data is loaded from the NY Times API
- Books are displayed using a RecyclerView
- Book cover images are downloaded and displayed using Glide

### Stretch Features

The stretch features will help develop this app into something closer to the NY Times website.

- View elements are styled in the .xml files
- The "Buy" button successfully opens the page on Amazon

View elements are styled in the .xml files
The "Buy" button successfully opens the page on Amazon


### Starter Code explanation

- BestSellerBook - the model representing a single book
- BestSellerBooksFragment - the fragment for our app, responsible for the networking
- BestSellerBooksRecyclerViewAdapter - the adapter for the RecyclerView, responsible for connecting the Views with the models
- MainActivity - the starting point for the code, creates a BestSellerBooksFragment
- OnListFragmentInteractionListener - an interface used by the RecyclerView adapter



```json
[
  {
    "rank": 1,
    "rank_last_week": 1,
    "weeks_on_list": 4,
    "asterisk": 0,
    "dagger": 0,
    "primary_isbn10": "1250178630",
    "primary_isbn13": "9781250178633",
    "publisher": "St. Martin's",
    "description": "In 1965, a nursing student follows her brother to serve during the Vietnam War and returns to a divided America.",
    "price": "0.00",
    "title": "THE WOMEN",
    "author": "Kristin Hannah",
    "contributor": "by Kristin Hannah",
    "contributor_note": "",
    "book_image": "https:\/\/storage.googleapis.com\/du-prd\/books\/images\/9781250178633.jpg",
    "book_image_width": 333,
    "book_image_height": 500,
    "amazon_product_url": "https:\/\/www.amazon.com\/dp\/1250178630?tag=NYTBSREV-20",
    "age_group": "",
    "book_review_link": "",
    "first_chapter_link": "",
    "sunday_review_link": "",
    "article_chapter_link": "",
    "isbns": [
      {
        "isbn10": "1250178630",
        "isbn13": "9781250178633"
      },
      {
        "isbn10": "1250178657",
        "isbn13": "9781250178657"
      }
    ],
    "buy_links": [
      {
        "name": "Amazon",
        "url": "https:\/\/www.amazon.com\/dp\/1250178630?tag=NYTBSREV-20"
      },
      {
        "name": "Apple Books",
        "url": "https:\/\/goto.applebooks.apple\/9781250178633?at=10lIEQ"
      },
      {
        "name": "Barnes and Noble",
        "url": "https:\/\/www.anrdoezrs.net\/click-7990613-11819508?url=https%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9781250178633"
      },
      {
        "name": "Books-A-Million",
        "url": "https:\/\/www.anrdoezrs.net\/click-7990613-35140?url=https%3A%2F%2Fwww.booksamillion.com%2Fp%2FTHE%2BWOMEN%2FKristin%2BHannah%2F9781250178633"
      },
      {
        "name": "Bookshop",
        "url": "https:\/\/bookshop.org\/a\/3546\/9781250178633"
      },
      {
        "name": "IndieBound",
        "url": "https:\/\/www.indiebound.org\/book\/9781250178633?aff=NYT"
      }
    ],
    "book_uri": "nyt:\/\/book\/9ce735af-71cf-5ff3-a367-43ee07e3fdd7"
  },
  {
    "rank": 2,
    "rank_last_week": 0,
    "weeks_on_list": 1,
    "asterisk": 0,
    "dagger": 0,
    "primary_isbn10": "0593331346",
    "primary_isbn13": "9780593331347",
    "publisher": "Putnam",
    "description": "The 24th book in the Joe Pickett series. A man released from prison uses grizzly bear attacks to cover his acts of revenge.",
    "price": "0.00",
    "title": "THREE-INCH TEETH",
    "author": "C.J. Box",
    "contributor": "by C.J. Box",
    "contributor_note": "",
    "book_image": "https:\/\/storage.googleapis.com\/du-prd\/books\/images\/9780593331347.jpg",
    "book_image_width": 332,
    "book_image_height": 500,
    "amazon_product_url": "https:\/\/www.amazon.com\/dp\/0593331346?tag=NYTBSREV-20",
    "age_group": "",
    "book_review_link": "",
    "first_chapter_link": "",
    "sunday_review_link": "",
    "article_chapter_link": "",
    "isbns": [
      {
        "isbn10": "0593331346",
        "isbn13": "9780593331347"
      },
      {
        "isbn10": "0593331354",
        "isbn13": "9780593331354"
      }
    ],
    "buy_links": [
      {
        "name": "Amazon",
        "url": "https:\/\/www.amazon.com\/dp\/0593331346?tag=NYTBSREV-20"
      },
      {
        "name": "Apple Books",
        "url": "https:\/\/goto.applebooks.apple\/9780593331347?at=10lIEQ"
      },
      {
        "name": "Barnes and Noble",
        "url": "https:\/\/www.anrdoezrs.net\/click-7990613-11819508?url=https%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9780593331347"
      },
      {
        "name": "Books-A-Million",
        "url": "https:\/\/www.anrdoezrs.net\/click-7990613-35140?url=https%3A%2F%2Fwww.booksamillion.com%2Fp%2FTHREE-INCH%2BTEETH%2FC.J.%2BBox%2F9780593331347"
      },
      {
        "name": "Bookshop",
        "url": "https:\/\/bookshop.org\/a\/3546\/9780593331347"
      },
      {
        "name": "IndieBound",
        "url": "https:\/\/www.indiebound.org\/book\/9780593331347?aff=NYT"
      }
    ],
    "book_uri": "nyt:\/\/book\/653dbf55-a521-5f74-bccb-0c7fc48456bb"
  },
  {
    "rank": 3,
    "rank_last_week": 0,
    "weeks_on_list": 1,
    "asterisk": 0,
    "dagger": 0,
    "primary_isbn10": "0593599837",
    "primary_isbn13": "9780593599839",
    "publisher": "Del Rey",
    "description": "After the secret of her magic to repel attacks is revealed, Freya encounters dangerous tests by the gods.",
    "price": "0.00",
    "title": "A FATE INKED IN BLOOD",
    "author": "Danielle L. Jensen",
    "contributor": "by Danielle L. Jensen",
    "contributor_note": "",
    "book_image": "https:\/\/storage.googleapis.com\/du-prd\/books\/images\/9780593599839.jpg",
    "book_image_width": 331,
    "book_image_height": 500,
    "amazon_product_url": "https:\/\/www.amazon.com\/dp\/0593599837?tag=NYTBSREV-20",
    "age_group": "",
    "book_review_link": "",
    "first_chapter_link": "",
    "sunday_review_link": "",
    "article_chapter_link": "",
    "isbns": [
      {
        "isbn10": "0593599837",
        "isbn13": "9780593599839"
      },
      {
        "isbn10": "0593599845",
        "isbn13": "9780593599846"
      }
    ]
  }
]
```