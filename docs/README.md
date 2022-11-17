## 🔍 기능 목록

### 🚀 Application class

- public void playBridgeGame()
  - 다리 게임이 진행되는 메소드

### 🚀 BridgeGame class

- public List<String> move(List<String>, String, int)
  - 다음 칸으로 이동하는 메소드
  - 이동한 후의 다리 상태를 List 형태로 반환


- public boolean rightMove(String, String)
  - 이동하려는 칸으로 실제 이동할 수 있는지 확인하는 메소드
  - 이동할 수 있으면 true, 이동할 수 없으면 false 반환


- public boolean retry(String)
  - 재시작/종료 여부를 통해 게임의 진행을 관리하는 메소드
  - 재시작의 경우 true, 종료의 경우 false 반환

### 🚀 BridgeMaker class

- public BridgeMaker(BridgeRandomNumberGenerator)
  - 다음에 올 다리의 위치(위, 아래)를 결정하는 생성자


- public List<String> makeBridge(int)
  - 건널 수 있는 칸의 위치를 반환하는 메소드


- private String whereIsBridge()
  - 다리의 위치가 어디인지 결정하는 메소드


### 🚀 InputView class

- public int readBridgeSize()
  - 다리의 길이를 입력받는 메소드


- private int changeInputStringToInteger(String)
  - 다리의 길이로 입력된 문자열을 Integer 자료형으로 변환하여 반환하는 메소드


- private void validateInputIsExit(String)
  - 입력값이 존재하는지(입력을 '\n' 등을 통해 넘기지 않았는지) 검사하는 메소드
  - 입력값이 존재하지 않는다면 IllegalStateException 발생


- private void validateInputSizeIsInteger(String)
  - 다리의 길이로 입력된 값이 숫자인지 검사하는 메소드
  - 입력값이 숫자가 아니라면 IllegalArgumentException 발생


- private void validateInputSizeIsInRange(String)
  - 다리의 길이로 입력된 수가 3~20 사이의 수인지 검사하는 메소드
  - 입력된 수가 3~20 사이의 수가 아니라면 IllegalArgumentException 발생


- public String readMoving()
  - 사용자가 이동할 칸을 입력받는 메소드


- private void validateInputMovingCharacter(String)
  - 이동할 칸으로 입력된 값이 'U' or 'D' 인지 검사하는 메소드
  - 입력값이 'U' or 'R'이 아니라면 IllegalArgumentException 발생


- public String readGameCommand()
  - 사용자가 게임의 재시작/종료에 대한 결정을 입력받는 메소드


- private void validateInputGameCommandCharacter(String)
  - 게임 재시작/종료 여부를 결정하는 입력값이 'R' or 'Q' 인지 검사하는 메소드
  - 입력값이 'R' or 'Q'가 아니라면 IllegalArgumentException 발생

### 🚀 OutputView class

- public void printGameStart()
  - 게임 시작 문구를 출력하는 메소드


- public void printBridgeSizeInputBox()
  - 다리의 길이 입력을 알리는 문구를 출력하는 메소드


- public void printMovingInputBox()
  - 이동할 칸 입력을 알리는 문구를 출력하는 메소드


- public void printGameCommand()
  - 게임 재시작/종료 여부에 대한 입력을 알리는 문구를 출력하는 메소드


- public void printMap(List<String>)
  - 현재의 다리 상태를 출력하는 메소드


- public void printResult(List<String>)
  - 최종 게임 결과를 출력하는 메소드


- public void printBridge(List<String>)
  - 다리 상태를 출력하는 메소드
  - printMap, printResult 메소드에서의 중복된 코드를 없애기 위한 메소드