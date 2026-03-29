class Solution {
    public double angleClock(int hour, int minutes) {
        // 1. Calculate the position of the hour hand in degrees
        // Each hour is 30 degrees (360/12). 
        // The hour hand also moves 0.5 degrees per minute (30/60).
        double hourAngle = (hour % 12) * 30 + (minutes * 0.5);
        
        // 2. Calculate the position of the minute hand in degrees
        // Each minute is 6 degrees (360/60).
        double minuteAngle = minutes * 6;
        
        // 3. Find the absolute difference
        double angle = Math.abs(hourAngle - minuteAngle);
        
        // 4. Return the smaller angle (the minor arc)
        if (angle > 180) {
            return 360 - angle;
        }
        return angle;
    }
}
