import java.util.ArrayList;
public class StepTracker
{
 private int minDays, totalSteps;
 private int totalDays, actDays;
 public stepTracker(int goal){
  minSteps = goal;
  totalSteps = 0;
  totalDays = 0;
  actDays = 0;
 }
 public void addDailySteps(int num){
  totalDays++;
  totalSteps += num;
  if (num >= minSteps){
   actDays++;
  }
 }
 public int activeDays(){
  return actDays;
 }
 public double averageSteps(){
  if (totalDays == 0){
   return 0.0;
 } else {
   return (double)totalSteps/totalDays;
  }
 }
} 
