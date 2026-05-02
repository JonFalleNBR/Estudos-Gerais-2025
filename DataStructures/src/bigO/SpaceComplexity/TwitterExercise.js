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
    
 ]
 // O(n^2) , here we`re going to compare each tweet with all the other tweets to find the most recent and the oldest one, so we have to loop through the array of tweets and compare each tweet with all the other tweets, so the time complexity is O(n^2) because we have to compare each tweet with all the other tweets, and we have n tweets, so we have to do n comparisons for each tweet, so we have n * n comparisons, so the time complexity is O(n^2)

    // get all these tweets and compare the dates to identify which one is the most recently and the Oldest one 
 
 function getMostRecentTweet(tweets){
    let oldest = tweets[0];
    let newest = tweets[0];

    for(let i = 0; i < tweets.length; i++){
        if(tweets[i].date < oldest.date){
            oldest = tweets[i];
        }else if(tweets[i].date > newest.date){
            newest = tweets[i];
        }

    }

    return {
        oldest, 
        newest
    }
 }



  /* 
Here we got a time complexity of O(n) and a Space Complexity of O(1) because we`re using a constant amount of space    

  */ 


 // Now lets find the total of Tweets as part of our learning  

 function getTotalTweets(tweets){
    let total = 0; 

    // better way to do this  

    for(let i = 0; i <tweets.length; i++){ // O(n)
        console.log(tweets[i].tweet +  
            "date: " + tweets[i].date
        ); 
        total++;
    }
    console.log("There are " + total + " tweets made between " + tweets[0].date + " and " + tweets[tweets.length - 1].date);
    return total;
 }



 getTotalTweets(tweets); // O(1) because we`re using a constant amount of space, we`re not using any additional space to store the total of tweets, we`re just using a variable to store the total of tweets, so the space complexity is O(1) because we`re using a constant amount of space, and the time complexity is O(1) because we`re just returning the length of the array of tweets, so the time complexity is O(1) because we`re just returning a value, we`re not doing any operations on the array of tweets, so the time complexity is O(1) because we`re just returning a value.