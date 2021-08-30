int count = 0;
void setup() {
  Serial.begin(9600);
}

void loop() {
  count++;
  Serial.print(count);
  Serial.println(" secs have passed");
  Serial.delay(1000);
}
