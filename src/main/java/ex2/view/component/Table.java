package ex2.view.component;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Table {
    private List<String> columns;
    private List<List<String>> rows;

    public String getTable() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.toString();
    }

    public String createHeader() {
        StringBuilder stringBuilder = new StringBuilder();
        columns.forEach(col -> {

        });
        return stringBuilder.toString();
    }

    public String createBody() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.toString();
    }




}
