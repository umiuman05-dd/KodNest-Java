public class P06 {
    public static void main(String[] args) {
        // write your code here
        int CompletedTopics = 17;
        int totalTopics = 20;
        int DailyLearningHours = 3;
        int LearningDays = 5;
        int remainingTopics = totalTopics - CompletedTopics;
        int weeklyLearningHours = DailyLearningHours * LearningDays;
        double progressPercentage = (double) CompletedTopics * 100 / totalTopics;
        System.out.println("Completed Topics: " + CompletedTopics);
        System.out.println("Remaining topics: " + remainingTopics);
        System.out.println("Weekly Learning hours: " + weeklyLearningHours);
        System.out.println("Progress percentage: " + progressPercentage);
    }
}