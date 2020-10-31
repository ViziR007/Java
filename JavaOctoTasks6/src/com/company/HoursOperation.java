package com.company;

    public class HoursOperation {
        public String secondsToTime(int Seconds) throws Exception{
            if(Seconds > 359999 || Seconds < 0){
                throw new Exception("Out of bounce");
            }
            int Hours = Seconds / 3600;
            int Minutes = (Seconds - Hours * 3600) / 60;
            return String.format("%s:%s:%s", Hours, Minutes, Seconds - (Hours * 3600 + Minutes * 60));
        }
    }

