#include <Microduino_RTC.h>


RTC rtc;

/* DateTime 
 * uint16_t year
 * uint8_t month, weekday, day, hour, minute, second
 * Hardcode DateTime for now, but if possible try to get updated date from some source
 */
DateTime dateTime = {2018, 10, 6, 13, 12, 0, 0};



void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  // Clear all registers
  rtc.begin();
  rtc.clearAll();
  // Set startup time
  rtc.setDateTime(dateTime);
}

void loop() {
  // put your main code here, to run repeatedly:
  rtc.getDateTime(&dateTime);
  Serial.print(dateTime.year);
  Serial.print("/");
  Serial.print(dateTime.month);
  Serial.print("/");
  Serial.print(dateTime.day);
  Serial.print("     ");
  Serial.print(dateTime.hour);
  Serial.print(":");
  Serial.print(dateTime.minute);
  Serial.print(":");
  Serial.print(dateTime.second);
  Serial.print("\r\n");
}