package kg.AD.values;

import kg.AD.MainActivity;
import kg.AD.begin.*;
import kg.AD.chapters.*;
import kg.AD.interfaceWorks.java.containers.*;
import kg.AD.interfaceWorks.xml.containerElements.*;
import kg.AD.interfaceWorks.xml.containers.*;
import kg.AD.interfaceWorks.xml.containers.FrameLayoutContainer;
import kg.AD.interfaceWorks.xml.containers.RelativeLayoutContainer;
import kg.AD.interfaceWorks.xml.elements.*;
import kg.AD.mainElements.Calculator;
import kg.AD.mainElements.xml.ButtonElement;
import kg.AD.mainElements.xml.CheckboxElement;
import kg.AD.mainElements.xml.EditTextElement;
import kg.AD.mainElements.xml.LayoutApp;
import kg.AD.mainElements.xml.SnackbarWindow;
import kg.AD.mainElements.xml.TextViewElement;
import kg.AD.mainElements.xml.ToastWindow;

public class Classes {
    /**
     * begin packages:
     */
    public final static Class<?> HELLO_ANDROID = HelloAndroid.class;
    public final static Class<?> GRAPHICAL_APPLICATION = GraphicApplication.class;
    public final static Class<?> DISPLAY_MESSAGE_ACTIVITY = DisplayMessageActivity.class;

    /**
     * interfaceWork packages:
     * JAVA:
     */
    //elements
    public final static Class<?> JAVA_ELEMENT = kg.AD.interfaceWorks.java.elements.Element.class;
    public final static Class<?> JAVA_GRAVITY_ELEMENT = kg.AD.interfaceWorks.java.elements.GravityElement.class;
    //containerElements
    public final static Class<?> JAVA_UNITS = kg.AD.interfaceWorks.java.containerElements.Units.class;
    public final static Class<?> JAVA_INDENTS = kg.AD.interfaceWorks.java.containerElements.Indents.class;
    //containers
    public final static Class<?> JAVA_LINEAR_LAYOUT = LinearLayoutContainer.class;
    public final static Class<?> JAVA_RELATIVE_LAYOUT = kg.AD.interfaceWorks.java.containers.RelativeLayoutContainer.class;
    public final static Class<?> JAVA_FRAME_LAYOUT = kg.AD.interfaceWorks.java.containers.FrameLayoutContainer.class;
    public final static Class<?> JAVA_SCROLL_VIEW_LAYOUT = kg.AD.interfaceWorks.java.containers.ScrollViewContainer.class;

    /**
     * interfaceWork packages:
     * XML:
     */
    //elements
    public final static Class<?> XML_ELEMENT = Element.class;
    public final static Class<?> XML_GRAVITY_ELEMENT = GravityElement.class;
    public final static Class<?> XML_MAIN_PANEL_ELEMENT = MainPanel.class;
    //containerElements
    public final static Class<?> XML_UNITS = Units.class;
    public final static Class<?> XML_INDENTS = Indents.class;
    //containers
    public final static Class<?> XML_HORIZONTAL_LINEAR_LAYOUT = HorizontalLinearLayout.class;
    public final static Class<?> XML_VERTICAL_LINEAR_LAYOUT = VerticalLinearLayout.class;
    public final static Class<?> XML_RELATIVE_LAYOUT = RelativeLayoutContainer.class;
    public final static Class<?> XML_TABLE_LAYOUT = TableLayoutContainer.class;
    public final static Class<?> XML_FRAME_LAYOUT = FrameLayoutContainer.class;
    public final static Class<?> XML_GRID_LAYOUT = GridLayoutContainer.class;
    public final static Class<?> XML_CONSTRAINT_LAYOUT = ConstraintLayoutContainer.class;


    /**
     * mainElements packages:
     * JAVA:
     */
    public final static Class<?> JAVA_TEXT_VIEW = kg.AD.mainElements.java.TextViewElement.class;
    public final static Class<?> JAVA_BUTTON = kg.AD.mainElements.java.ButtonElement.class;

    /**
     * mainElements packages:
     * XML:
     */
    public final static Class<?> XML_TEXT_VIEW = TextViewElement.class;
    public final static Class<?> XML_EDIT_VIEW = EditTextElement.class;
    public final static Class<?> LAYOUT_APP = LayoutApp.class;
    public final static Class<?> BUTTON = ButtonElement.class;
    public final static Class<?> TOAST = ToastWindow.class;
    public final static Class<?> SNACKBAR = SnackbarWindow.class;
    public final static Class<?> CHECKBOX = CheckboxElement.class;

    /**
     * mainElements packages:
     */
    public final static Class<?> CALCULATOR = Calculator.class;

    /**
     * chapters packages:
     */
    public final static Class<?> MAIN_ACTIVITY = MainActivity.class;
    public final static Class<?> BEGIN_CHAPTER = BeginChapter.class;
    public final static Class<?> INTERFACE_CHAPTER = InterfaceChapter.class;
    public final static Class<?> MAIN_ELEMENTS_CHAPTER = MainElementsChapter.class;
    public final static Class<?> RESOURCES_CHAPTER = ResourcesChapter.class;
    public final static Class<?> ACTIVITY_CHAPTER = ActivityChapter.class;
    public final static Class<?> IMAGE_CHAPTER = ImageChapter.class;
    public final static Class<?> ADAPTERS_AND_LISTS_CHAPTER = AdaptersAndListsChapter.class;
    public final static Class<?> CONTAINERS_CHAPTER = AllContainers.class;

}
