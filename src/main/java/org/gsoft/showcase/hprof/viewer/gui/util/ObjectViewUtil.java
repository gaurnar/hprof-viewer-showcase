package org.gsoft.showcase.hprof.viewer.gui.util;

import org.gsoft.showcase.hprof.viewer.HprofViewer.HeapDumpClassInstanceField;
import org.gsoft.showcase.hprof.viewer.HprofViewer.HeapDumpClassInstanceObjectField;
import org.gsoft.showcase.hprof.viewer.HprofViewer.HeapDumpClassInstancePrimitiveField;

public final class ObjectViewUtil {

    private ObjectViewUtil() {
        throw new UnsupportedOperationException();
    }

    public static String showFieldValue(HeapDumpClassInstanceField field) {
        if (field instanceof HeapDumpClassInstancePrimitiveField) {
            return ((HeapDumpClassInstancePrimitiveField) field).getValueAsString();
        } else { // HeapDumpClassInstanceObjectField
            return "<" + ((HeapDumpClassInstanceObjectField) field).getTypeName() + ">";
        }
    }

}
