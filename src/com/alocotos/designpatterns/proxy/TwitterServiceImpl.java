package com.alocotos.designpatterns.proxy;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterServiceImpl implements TwitterService {
	
	private String TWITTER_CONSUMER_KEY;
	private String TWITTER_SECRET_KEY;
	private String TWITTER_ACCESS_TOKEN;
	private String TWITTER_ACCESS_TOKEN_SECRET;

	public TwitterServiceImpl(String twiConsKey, String twiSecKey, String twiAccTok, String twiAccSecTok) {
		this.TWITTER_CONSUMER_KEY = twiConsKey;
		this.TWITTER_SECRET_KEY = twiSecKey;
		this.TWITTER_ACCESS_TOKEN = twiAccTok;
		this.TWITTER_ACCESS_TOKEN_SECRET = twiAccSecTok;
		
	}

	@Override
	public String getTimeline(String screenName) {
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
			.setOAuthConsumerSecret(TWITTER_SECRET_KEY)
			.setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
			.setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		StringBuilder builder = new StringBuilder();
		//Added counter to just retrieve 10 tweets.
		int i = 0;
	
		try {
			Query query = new Query(screenName);
			QueryResult result;
			do {
				result = twitter.search(query);
				List<Status> tweets = result.getTweets();
				for(Status tweet : tweets) {
					builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
					builder.append("\n");
				}
				
				i++;
				
			} while((query = result.nextQuery()) != null && i < 11);
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
		}
		
		return builder.toString();
		
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		//Currently not allowing this, but we could make an app that posts to Twitter for us. 
		System.out.println(message);
	}

}
