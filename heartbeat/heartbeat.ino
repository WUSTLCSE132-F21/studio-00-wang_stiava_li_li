/* heartbeat
 *
 * output simple hello message
 *
 */

void setup() {
}

void loop() {
  Serial.begin(9600);
  Serial.println("sec have elapsed");
  Serial.delay(1000);
}
