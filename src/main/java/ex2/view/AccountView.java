package ex2.view;
import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.entity.Account;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AccountView implements View{
    private Account currentAccount;



    @Override
    public void render() {
        ResponseDto<?> accountListResponse = Controller.getAccountListController();
        if (currentAccount == null) {
            if (accountListResponse.getStatus() == 400) {
                accountError(accountListResponse.getData().toString());
                RouterPath.current = Routes.HOME.name();
                return;
            }
            selectAccount((List<Account>) accountListResponse.getData());
            System.out.println("======<< 계좌 ID선택 >>======");
            int selectedId = Integer.parseInt(Input.nextLine());
            ResponseDto<?> response = Controller.selectAccountController(selectedId);
            if (response.getStatus() == 400) {
                accountError(response.getData().toString());
                return;
            }
            currentAccount = (Account) response.getData(); //세션데이터

        }
        accountMenu();
        String cmd = Input.nextLine();
        ResponseDto<?> menuResponse = Controller.accountMenuController(cmd);
        if (menuResponse.getStatus() == 100) {
            RouterPath.current = Routes.HOME.name();
            currentAccount = null;
            return;
        }
        if (menuResponse.getStatus() == 400) {
            accountError(menuResponse.getData().toString());
        }
    }


    private void accountError(String message) {
        Map<String, String> props = new HashMap<>();
        props.put("title", "문제발견");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오류 메세지: ");
        stringBuilder.append(message);
        stringBuilder.append("\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
        Input.nextWait();
    }


    private void selectAccount(List<Account> accountList) {
        Map<String, String> props = new HashMap<>();
        props.put("title", "계좌 목록");

        int maxOfAccountNoLengtth = accountList.stream()
                .map(account -> account.getAccountNo().length())
                .max(Comparator.comparingInt(prev -> prev))
                .get();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("| ID |");
        for (int i = 0; i < (maxOfAccountNoLengtth - "계좌번호".length()) / 2; i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("계좌번호");
        for (int i = 0; i < (maxOfAccountNoLengtth - "계좌번호".length()) / 2; i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("| 예금주 |\n");

        accountList.forEach(account -> {
            stringBuilder.append(String.format("| %d | %s | %s |", account.getId(), account.getAccountNo(), account.getOwner()));
        });
        props.put("body", stringBuilder.toString());
        basicLayout(props);
    }

    private void accountMenu() {
        Map<String, String> props = new HashMap<>();
        props.put("title",String.format("선택계좌: %s", currentAccount.getAccountNo()));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. 거래내역조회\n");
        stringBuilder.append("2. 입금\n");
        stringBuilder.append("3. 출금\n");
        stringBuilder.append("b. 뒤로가기\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);

    }
}


