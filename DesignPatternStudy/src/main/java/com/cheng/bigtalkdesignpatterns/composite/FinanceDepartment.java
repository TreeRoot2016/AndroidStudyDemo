package com.cheng.bigtalkdesignpatterns.composite;

/**
 * 人力资源部
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String _name) {
        super(_name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println(getStrByDepth(depth) + name);
    }

    private String getStrByDepth(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "公司财务收支管理");
    }
}
