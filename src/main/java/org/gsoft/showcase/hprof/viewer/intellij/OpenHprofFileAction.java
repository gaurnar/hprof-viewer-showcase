package org.gsoft.showcase.hprof.viewer.intellij;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.gsoft.showcase.hprof.viewer.gui.MainViewerForm;
import org.jetbrains.annotations.NotNull;

public class OpenHprofFileAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        MainViewerForm mainViewerForm = new MainViewerForm();
        mainViewerForm.setLocationRelativeTo(null);
        mainViewerForm.setVisible(true);
    }

    @Override
    public boolean isDumbAware() {
        return true;
    }
}
