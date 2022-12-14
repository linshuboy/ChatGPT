package com.obiscr.chatgpt.ui.action.editor;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.obiscr.chatgpt.message.ChatGPTBundle;
import org.jetbrains.annotations.NotNull;

/**
 * @author Wuzi
 */
public class TestAction extends AbstractEditorAction {

    public TestAction() {
        super(() -> ChatGPTBundle.message("action.code.test.menu"));
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

    }

}
