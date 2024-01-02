class Main {
  public static void main(String[] args) {
    int[] Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int Sundays = 0;
    //String[] WeekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int Start = 2;
  for (int i=1901; i<= 2000; i++){
    for (int j=0; j<= 11; j++){
      
      if (i%4 == 0){
        Days[1] = 29;
      }
      int mod = Days[j]%7;
      
      if (Start ==0){
        Sundays += 1;
      }
      
      int tmp = mod + Start;
      int day = tmp %7;
      Start = day;
      
      
      Days[1] = 28;
    }
  }
  System.out.println(Sundays);
  }
}