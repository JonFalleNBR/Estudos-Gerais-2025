// We have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter, we have to find the first and find Nth most recent tweet of a user in twitter.

// Using and applying the concepts  of BigO Annotation  

 const tweets = [
    {
        tweet: 'hi',
        date : '2020-01-01'
        },
    {
        tweet: 'my',
        date : '2022-01-02'
        },
    {
        tweet: 'Friend',
        date : '2025-01-03'
    }
    // O(n^2) , here we`re going to compare each tweet with all the other tweets to find the most recent and the oldest one, so we have to loop through the array of tweets and compare each tweet with all the other tweets, so the time complexity is O(n^2) because we have to compare each tweet with all the other tweets, and we have n tweets, so we have to do n comparisons for each tweet, so we have n * n comparisons, so the time complexity is O(n^2)

    // get all these tweets and compare the dates to identify which one is the most recently and the Oldest one 
 ]
 

 // h
 function compareTweets(tweets){
    let oldestTweet = tweets[0]; // O(1) because we`re looking for the first item of the array, so the time complexity is O(1)
    let newestTweet = tweets[0]; // O(1) because we`re looking for the first item of the array, so the time complexity is O(1)

     for(let i = 0; i < tweets.length; i++){ // O(n) because we have to loop through the array of tweets, so the time complexity is O(n)
        if(tweets[i].date < oldestTweet.date){
            oldestTweet = tweets[i];
        }else if(tweets[i].date > newestTweet.date){
            newestTweet = tweets[i];
        }
    }

return {
    oldestTweet, 
    newestTweet
}
 }