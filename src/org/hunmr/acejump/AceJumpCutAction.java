package org.hunmr.acejump;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import org.hunmr.acejump.command.CutAfterJumpCommand;

public class AceJumpCutAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        Editor editor = e.getData(PlatformDataKeys.EDITOR);

        AceJumpAction.getInstance().switchEditorIfNeed(e);
        AceJumpAction.getInstance().addCommandAroundJump(new CutAfterJumpCommand(editor));
        AceJumpAction.getInstance().performAction(e);
    }
}
