package bridge;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(List<String> bridge) {
        printBridge(bridge);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(List<String> bridge, boolean passOrFail, int number) {
        System.out.println("최종 게임 결과");
        printBridge(bridge);
        System.out.println("게임 성공 여부: " + printSuccessOrFail(passOrFail));
        System.out.println("총 시도한 횟수: " + number);
    }

    private String printSuccessOrFail(boolean passOrFail) {
        if (passOrFail) {
            return "성공";
        }
        return "실패";
    }

    public void printGameStart() {
        System.out.println("다리 건너기 게임을 시작합니다.");
    }

    public void printBridgeSizeInputBox() {
        System.out.println("다리의 길이를 입력해주세요.");
    }

    public void printMovingInputBox() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
    }

    public void printGameCommand() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
    }

    public void printBridge(List<String> bridge) {
        for (int i = 0; i < bridge.size() / 2; i++) {
            System.out.print(bridge.get(i));
        }
        System.out.println();
        for (int i = bridge.size() / 2; i < bridge.size(); i++) {
            System.out.print(bridge.get(i));
        }
        System.out.println();
    }

    private void printBridgeTop(List<String> topBridge) {
        System.out.print("[ ");
        for (String top : topBridge) {
            System.out.println(top);
        }
        System.out.println(" ]");
    }

    private void printBridgeBottom(List<String> bottomBridge) {
        System.out.print("[ ");
        for (String bottom : bottomBridge) {
            System.out.println(bottom);
        }
        System.out.println(" ]");
        System.out.println();
    }
}
