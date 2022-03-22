package programmers.problem.p5;

// (1) TCP 통신과 UDP 통신의 차이점:
//
// (2) TCP 통신을 사용하는 곳:
//
// (3) UDP 통신을 사용하는 곳:
public class Solution {
    String p1 = "TCP 신뢰성(Reliable)이 있다.: Ack, Checksum, UDP Unreliable 신뢰성이 없다." +
            "TCP 연결 지향성(Connection-oriented) 연결을 맺고 통신한다. UPD 비 연결성(Connection less)" +
            "TCP 재전송 요청함(오류 및 패킷 손실 검출 시) UDP 재전송 없음" +
            "TCP 흐름 제어(Flow control)을 위해 windowing 사용, 속도는 다소 느려도 신뢰성을 제공, UDP 신뢰성은 보장하지 않지만, 고속데이터 전송. 실시간 전송에 적합" +
            "TCP 는 신뢰성이 필요한 통신, UDP는 총 패킷수가 적은 통신+동영상 및 음성 등 멀티미디어 통신";

    String p2 = "";

    String p3 = "";
}
