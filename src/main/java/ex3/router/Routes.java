package ex3.router;

import ex3.view.AccountView;
import ex3.view.Homeview;
import ex3.view.View;
import lombok.Getter;

public enum Routes {
    HOME(new Homeview()),ACCOUNT(new AccountView()), DEPOSIT(null), WITHDRAWAL(null);

    @Getter
    private View view;

    Routes(View view) {
        this.view = view;
    }

}
