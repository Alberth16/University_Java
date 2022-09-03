package org.example.view;

import org.example.utils.abstracts.Report;
import org.example.view.interfaces.IOption;

public class ReportOption implements IOption {
    private final Report report;
    public ReportOption(Report report) {
        this.report = report;
    }

    @Override
    public void execute() {
        System.out.println("Report saved in: "+ this.report.generate());
    }
}
