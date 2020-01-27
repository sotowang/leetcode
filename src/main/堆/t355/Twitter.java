package 堆.t355;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/1/26 21:41
 */
public class Twitter {
    private static int tweetTime = 0;
    class Tweet {
        private int id;
        private int time;
        private Tweet next;

        public Tweet(int id, int time) {
            this.id = id;
            this.time = time;
            this.next = null;
        }
    }

    class User {
        private int id;
        private Set<Integer> followed;
        //用户发表推文链表头节点
        private Tweet head;

        public User(int userId) {
            this.id = userId;
            followed = new HashSet<>();
            //关注一下自己
            follow(userId);
        }

        public void follow(int userId) {
            followed.add(userId);
        }

        public void unFollow(int userId) {
            if (id != userId) {
                followed.remove(Integer.valueOf(userId));
            }
        }

        public Set<Integer> getFollowed() {
            return followed;
        }

        public void post(int tweetId) {
            Tweet tweet = new Tweet(tweetId, tweetTime);
            tweetTime++;
            //新建推文插入在head前
            tweet.next = head;
            head = tweet;
        }
    }

    //userId与User的映射
    private HashMap<Integer, User> userHashMap;

    /**
     * Initialize your data structure here.
     */
    public Twitter() {
        userHashMap = new HashMap<>();
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        User user;
        if (!userHashMap.containsKey(userId)) {
            user = new User(userId);
            userHashMap.put(userId, user);
        }
        user = userHashMap.get(userId);
        user.post(tweetId);
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if (!userHashMap.containsKey(userId)) {
            return res;
        }
        Set<Integer> followedList = userHashMap.get(userId).getFollowed();
        PriorityQueue<Tweet> minHeap = new PriorityQueue<Tweet>((a, b) -> (b.time - a.time));
        for (int id : followedList) {
            if (userHashMap.get(id).head != null) {

                minHeap.offer(userHashMap.get(id).head);
            }
        }
        res = mergeTweet(minHeap);
        return res;
    }

    private List<Integer> mergeTweet(PriorityQueue<Tweet> minHeap) {
        List<Integer> res = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            if (res.size() == 10) {
                break;
            }
            Tweet tweet = minHeap.poll();
            if (tweet.next != null) {
                minHeap.offer(tweet.next);
            }
            res.add(tweet.id);
        }
        return res;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        User user;
        if (!userHashMap.containsKey(followerId)) {
            userHashMap.put(followerId, new User(followerId));
        }
        user = userHashMap.get(followerId);
        if (!userHashMap.containsKey(followeeId)) {
            userHashMap.put(followeeId, new User(followeeId));
        }
        user.follow(followeeId);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        if (userHashMap.containsKey(followerId) && userHashMap.containsKey(followeeId)) {
            User user = userHashMap.get(followerId);
            user.unFollow(followeeId);
        }
    }


    public static void main(String[] args) {
//["Twitter","postTweet","follow","follow","getNewsFeed","postTweet","getNewsFeed","getNewsFeed","unfollow","getNewsFeed","getNewsFeed","unfollow","getNewsFeed","getNewsFeed"]
//[[],[1,5],[1,2],[2,1],[2],[2,6],[1],[2],[2,1],[1],[2],[1,2],[1],[2]]
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        twitter.follow(1, 2);
        twitter.follow(2, 1);
        System.out.println(twitter.getNewsFeed(2));
        twitter.postTweet(2, 6);
        System.out.println(twitter.getNewsFeed(1));

        System.out.println(twitter.getNewsFeed(2));


        twitter.unfollow(2,1);
        System.out.println(twitter.getNewsFeed(1));
        System.out.println(twitter.getNewsFeed(2));
        twitter.unfollow(1,2);
        System.out.println(twitter.getNewsFeed(1));
        System.out.println(twitter.getNewsFeed(2));


    }
}
