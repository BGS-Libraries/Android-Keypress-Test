package com.brightcove.keypresstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView centerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        centerText = (TextView) findViewById(R.id.center_text);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        String keyCodeString;

        switch (keyCode) {
            case KeyEvent.KEYCODE_SOFT_LEFT:
                keyCodeString = "SOFT_LEFT";
                break;
            case KeyEvent.KEYCODE_SOFT_RIGHT:
                keyCodeString = "SOFT_RIGHT";
                break;
            case KeyEvent.KEYCODE_HOME:
                keyCodeString = "HOME";
                break;
            case KeyEvent.KEYCODE_BACK:
                keyCodeString = "BACK";
                break;
            case KeyEvent.KEYCODE_CALL:
                keyCodeString = "CALL";
                break;
            case KeyEvent.KEYCODE_ENDCALL:
                keyCodeString = "ENDCALL";
                break;
            case KeyEvent.KEYCODE_0:
                keyCodeString = "0";
                break;
            case KeyEvent.KEYCODE_1:
                keyCodeString = "1";
                break;
            case KeyEvent.KEYCODE_2:
                keyCodeString = "2";
                break;
            case KeyEvent.KEYCODE_3:
                keyCodeString = "3";
                break;
            case KeyEvent.KEYCODE_4:
                keyCodeString = "4";
                break;
            case KeyEvent.KEYCODE_5:
                keyCodeString = "5";
                break;
            case KeyEvent.KEYCODE_6:
                keyCodeString = "6";
                break;
            case KeyEvent.KEYCODE_7:
                keyCodeString = "7";
                break;
            case KeyEvent.KEYCODE_8:
                keyCodeString = "8";
                break;
            case KeyEvent.KEYCODE_9:
                keyCodeString = "9";
                break;
            case KeyEvent.KEYCODE_STAR:
                keyCodeString = "STAR";
                break;
            case KeyEvent.KEYCODE_POUND:
                keyCodeString = "POUND";
                break;
            case KeyEvent.KEYCODE_DPAD_UP:
                keyCodeString = "DPAD_UP";
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                keyCodeString = "DPAD_DOWN";
                break;
            case KeyEvent.KEYCODE_DPAD_LEFT:
                keyCodeString = "DPAD_LEFT";
                break;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                keyCodeString = "DPAD_RIGHT";
                break;
            case KeyEvent.KEYCODE_DPAD_CENTER:
                keyCodeString = "DPAD_CENTER";
                break;
            case KeyEvent.KEYCODE_VOLUME_UP:
                keyCodeString = "VOLUME_UP";
                break;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                keyCodeString = "VOLUME_DOWN";
                break;
            case KeyEvent.KEYCODE_POWER:
                keyCodeString = "POWER";
                break;
            case KeyEvent.KEYCODE_CAMERA:
                keyCodeString = "CAMERA";
                break;
            case KeyEvent.KEYCODE_CLEAR:
                keyCodeString = "CLEAR";
                break;
            case KeyEvent.KEYCODE_A:
                keyCodeString = "A";
                break;
            case KeyEvent.KEYCODE_B:
                keyCodeString = "B";
                break;
            case KeyEvent.KEYCODE_C:
                keyCodeString = "C";
                break;
            case KeyEvent.KEYCODE_D:
                keyCodeString = "D";
                break;
            case KeyEvent.KEYCODE_E:
                keyCodeString = "E";
                break;
            case KeyEvent.KEYCODE_F:
                keyCodeString = "F";
                break;
            case KeyEvent.KEYCODE_G:
                keyCodeString = "G";
                break;
            case KeyEvent.KEYCODE_H:
                keyCodeString = "H";
                break;
            case KeyEvent.KEYCODE_I:
                keyCodeString = "I";
                break;
            case KeyEvent.KEYCODE_J:
                keyCodeString = "J";
                break;
            case KeyEvent.KEYCODE_K:
                keyCodeString = "K";
                break;
            case KeyEvent.KEYCODE_L:
                keyCodeString = "L";
                break;
            case KeyEvent.KEYCODE_M:
                keyCodeString = "M";
                break;
            case KeyEvent.KEYCODE_N:
                keyCodeString = "N";
                break;
            case KeyEvent.KEYCODE_O:
                keyCodeString = "O";
                break;
            case KeyEvent.KEYCODE_P:
                keyCodeString = "P";
                break;
            case KeyEvent.KEYCODE_Q:
                keyCodeString = "Q";
                break;
            case KeyEvent.KEYCODE_R:
                keyCodeString = "R";
                break;
            case KeyEvent.KEYCODE_S:
                keyCodeString = "S";
                break;
            case KeyEvent.KEYCODE_T:
                keyCodeString = "T";
                break;
            case KeyEvent.KEYCODE_U:
                keyCodeString = "U";
                break;
            case KeyEvent.KEYCODE_V:
                keyCodeString = "V";
                break;
            case KeyEvent.KEYCODE_W:
                keyCodeString = "W";
                break;
            case KeyEvent.KEYCODE_X:
                keyCodeString = "X";
                break;
            case KeyEvent.KEYCODE_Y:
                keyCodeString = "Y";
                break;
            case KeyEvent.KEYCODE_Z:
                keyCodeString = "Z";
                break;
            case KeyEvent.KEYCODE_COMMA:
                keyCodeString = "COMMA";
                break;
            case KeyEvent.KEYCODE_PERIOD:
                keyCodeString = "PERIOD";
                break;
            case KeyEvent.KEYCODE_ALT_LEFT:
                keyCodeString = "ALT_LEFT";
                break;
            case KeyEvent.KEYCODE_ALT_RIGHT:
                keyCodeString = "ALT_RIGHT";
                break;
            case KeyEvent.KEYCODE_SHIFT_LEFT:
                keyCodeString = "SHIFT_LEFT";
                break;
            case KeyEvent.KEYCODE_SHIFT_RIGHT:
                keyCodeString = "SHIFT_RIGHT";
                break;
            case KeyEvent.KEYCODE_TAB:
                keyCodeString = "TAB";
                break;
            case KeyEvent.KEYCODE_SPACE:
                keyCodeString = "SPACE";
                break;
            case KeyEvent.KEYCODE_SYM:
                keyCodeString = "SYM";
                break;
            case KeyEvent.KEYCODE_EXPLORER:
                keyCodeString = "EXPLORER";
                break;
            case KeyEvent.KEYCODE_ENVELOPE:
                keyCodeString = "ENVELOPE";
                break;
            case KeyEvent.KEYCODE_ENTER:
                keyCodeString = "ENTER";
                break;
            case KeyEvent.KEYCODE_DEL:
                keyCodeString = "DEL";
                break;
            case KeyEvent.KEYCODE_GRAVE:
                keyCodeString = "GRAVE";
                break;
            case KeyEvent.KEYCODE_MINUS:
                keyCodeString = "MINUS";
                break;
            case KeyEvent.KEYCODE_EQUALS:
                keyCodeString = "EQUALS";
                break;
            case KeyEvent.KEYCODE_LEFT_BRACKET:
                keyCodeString = "LEFT_BRACKET";
                break;
            case KeyEvent.KEYCODE_RIGHT_BRACKET:
                keyCodeString = "RIGHT_BRACKET";
                break;
            case KeyEvent.KEYCODE_BACKSLASH:
                keyCodeString = "BACKSLASH";
                break;
            case KeyEvent.KEYCODE_SEMICOLON:
                keyCodeString = "SEMICOLON";
                break;
            case KeyEvent.KEYCODE_APOSTROPHE:
                keyCodeString = "APOSTROPHE";
                break;
            case KeyEvent.KEYCODE_SLASH:
                keyCodeString = "SLASH";
                break;
            case KeyEvent.KEYCODE_AT:
                keyCodeString = "AT";
                break;
            case KeyEvent.KEYCODE_NUM:
                keyCodeString = "NUM";
                break;
            case KeyEvent.KEYCODE_HEADSETHOOK:
                keyCodeString = "HEADSETHOOK";
                break;
            case KeyEvent.KEYCODE_FOCUS:
                keyCodeString = "FOCUS";
                break;
            case KeyEvent.KEYCODE_PLUS:
                keyCodeString = "PLUS";
                break;
            case KeyEvent.KEYCODE_MENU:
                keyCodeString = "MENU";
                break;
            case KeyEvent.KEYCODE_NOTIFICATION:
                keyCodeString = "NOTIFICATION";
                break;
            case KeyEvent.KEYCODE_SEARCH:
                keyCodeString = "SEARCH";
                break;
            case KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE:
                keyCodeString = "MEDIA_PLAY_PAUSE";
                break;
            case KeyEvent.KEYCODE_MEDIA_STOP:
                keyCodeString = "MEDIA_STOP";
                break;
            case KeyEvent.KEYCODE_MEDIA_NEXT:
                keyCodeString = "MEDIA_NEXT";
                break;
            case KeyEvent.KEYCODE_MEDIA_PREVIOUS:
                keyCodeString = "MEDIA_PREVIOUS";
                break;
            case KeyEvent.KEYCODE_MEDIA_REWIND:
                keyCodeString = "MEDIA_REWIND";
                break;
            case KeyEvent.KEYCODE_MEDIA_FAST_FORWARD:
                keyCodeString = "MEDIA_FAST_FORWARD";
                break;
            case KeyEvent.KEYCODE_MUTE:
                keyCodeString = "MUTE";
                break;
            case KeyEvent.KEYCODE_PAGE_UP:
                keyCodeString = "PAGE_UP";
                break;
            case KeyEvent.KEYCODE_PAGE_DOWN:
                keyCodeString = "PAGE_DOWN";
                break;
            case KeyEvent.KEYCODE_PICTSYMBOLS:
                keyCodeString = "PICTSYMBOLS";
                break;
            case KeyEvent.KEYCODE_SWITCH_CHARSET:
                keyCodeString = "SWITCH_CHARSET";
                break;
            case KeyEvent.KEYCODE_BUTTON_A:
                keyCodeString = "BUTTON_A";
                break;
            case KeyEvent.KEYCODE_BUTTON_B:
                keyCodeString = "BUTTON_B";
                break;
            case KeyEvent.KEYCODE_BUTTON_C:
                keyCodeString = "BUTTON_C";
                break;
            case KeyEvent.KEYCODE_BUTTON_X:
                keyCodeString = "BUTTON_X";
                break;
            case KeyEvent.KEYCODE_BUTTON_Y:
                keyCodeString = "BUTTON_Y";
                break;
            case KeyEvent.KEYCODE_BUTTON_Z:
                keyCodeString = "BUTTON_Z";
                break;
            case KeyEvent.KEYCODE_BUTTON_L1:
                keyCodeString = "BUTTON_L1";
                break;
            case KeyEvent.KEYCODE_BUTTON_R1:
                keyCodeString = "BUTTON_R1";
                break;
            case KeyEvent.KEYCODE_BUTTON_L2:
                keyCodeString = "BUTTON_L2";
                break;
            case KeyEvent.KEYCODE_BUTTON_R2:
                keyCodeString = "BUTTON_R2";
                break;
            case KeyEvent.KEYCODE_BUTTON_THUMBL:
                keyCodeString = "BUTTON_THUMBL";
                break;
            case KeyEvent.KEYCODE_BUTTON_THUMBR:
                keyCodeString = "BUTTON_THUMBR";
                break;
            case KeyEvent.KEYCODE_BUTTON_START:
                keyCodeString = "BUTTON_START";
                break;
            case KeyEvent.KEYCODE_BUTTON_SELECT:
                keyCodeString = "BUTTON_SELECT";
                break;
            case KeyEvent.KEYCODE_BUTTON_MODE:
                keyCodeString = "BUTTON_MODE";
                break;
            case KeyEvent.KEYCODE_ESCAPE:
                keyCodeString = "ESCAPE";
                break;
            case KeyEvent.KEYCODE_FORWARD_DEL:
                keyCodeString = "FORWARD_DEL";
                break;
            case KeyEvent.KEYCODE_CTRL_LEFT:
                keyCodeString = "CTRL_LEFT";
                break;
            case KeyEvent.KEYCODE_CTRL_RIGHT:
                keyCodeString = "CTRL_RIGHT";
                break;
            case KeyEvent.KEYCODE_CAPS_LOCK:
                keyCodeString = "CAPS_LOCK";
                break;
            case KeyEvent.KEYCODE_SCROLL_LOCK:
                keyCodeString = "SCROLL_LOCK";
                break;
            case KeyEvent.KEYCODE_META_LEFT:
                keyCodeString = "META_LEFT";
                break;
            case KeyEvent.KEYCODE_META_RIGHT:
                keyCodeString = "META_RIGHT";
                break;
            case KeyEvent.KEYCODE_FUNCTION:
                keyCodeString = "FUNCTION";
                break;
            case KeyEvent.KEYCODE_SYSRQ:
                keyCodeString = "SYSRQ";
                break;
            case KeyEvent.KEYCODE_BREAK:
                keyCodeString = "BREAK";
                break;
            case KeyEvent.KEYCODE_MOVE_HOME:
                keyCodeString = "MOVE_HOME";
                break;
            case KeyEvent.KEYCODE_MOVE_END:
                keyCodeString = "MOVE_END";
                break;
            case KeyEvent.KEYCODE_INSERT:
                keyCodeString = "INSERT";
                break;
            case KeyEvent.KEYCODE_FORWARD:
                keyCodeString = "FORWARD";
                break;
            case KeyEvent.KEYCODE_MEDIA_PLAY:
                keyCodeString = "MEDIA_PLAY";
                break;
            case KeyEvent.KEYCODE_MEDIA_PAUSE:
                keyCodeString = "MEDIA_PAUSE";
                break;
            case KeyEvent.KEYCODE_MEDIA_CLOSE:
                keyCodeString = "MEDIA_CLOSE";
                break;
            case KeyEvent.KEYCODE_MEDIA_EJECT:
                keyCodeString = "MEDIA_EJECT";
                break;
            case KeyEvent.KEYCODE_MEDIA_RECORD:
                keyCodeString = "MEDIA_RECORD";
                break;
            case KeyEvent.KEYCODE_F1:
                keyCodeString = "F1";
                break;
            case KeyEvent.KEYCODE_F2:
                keyCodeString = "F2";
                break;
            case KeyEvent.KEYCODE_F3:
                keyCodeString = "F3";
                break;
            case KeyEvent.KEYCODE_F4:
                keyCodeString = "F4";
                break;
            case KeyEvent.KEYCODE_F5:
                keyCodeString = "F5";
                break;
            case KeyEvent.KEYCODE_F6:
                keyCodeString = "F6";
                break;
            case KeyEvent.KEYCODE_F7:
                keyCodeString = "F7";
                break;
            case KeyEvent.KEYCODE_F8:
                keyCodeString = "F8";
                break;
            case KeyEvent.KEYCODE_F9:
                keyCodeString = "F9";
                break;
            case KeyEvent.KEYCODE_F10:
                keyCodeString = "F10";
                break;
            case KeyEvent.KEYCODE_F11:
                keyCodeString = "F11";
                break;
            case KeyEvent.KEYCODE_F12:
                keyCodeString = "F12";
                break;
            case KeyEvent.KEYCODE_NUM_LOCK:
                keyCodeString = "NUM_LOCK";
                break;
            case KeyEvent.KEYCODE_NUMPAD_0:
                keyCodeString = "NUMPAD_0";
                break;
            case KeyEvent.KEYCODE_NUMPAD_1:
                keyCodeString = "NUMPAD_1";
                break;
            case KeyEvent.KEYCODE_NUMPAD_2:
                keyCodeString = "NUMPAD_2";
                break;
            case KeyEvent.KEYCODE_NUMPAD_3:
                keyCodeString = "NUMPAD_3";
                break;
            case KeyEvent.KEYCODE_NUMPAD_4:
                keyCodeString = "NUMPAD_4";
                break;
            case KeyEvent.KEYCODE_NUMPAD_5:
                keyCodeString = "NUMPAD_5";
                break;
            case KeyEvent.KEYCODE_NUMPAD_6:
                keyCodeString = "NUMPAD_6";
                break;
            case KeyEvent.KEYCODE_NUMPAD_7:
                keyCodeString = "NUMPAD_7";
                break;
            case KeyEvent.KEYCODE_NUMPAD_8:
                keyCodeString = "NUMPAD_8";
                break;
            case KeyEvent.KEYCODE_NUMPAD_9:
                keyCodeString = "NUMPAD_9";
                break;
            case KeyEvent.KEYCODE_NUMPAD_DIVIDE:
                keyCodeString = "NUMPAD_DIVIDE";
                break;
            case KeyEvent.KEYCODE_NUMPAD_MULTIPLY:
                keyCodeString = "NUMPAD_MULTIPLY";
                break;
            case KeyEvent.KEYCODE_NUMPAD_SUBTRACT:
                keyCodeString = "NUMPAD_SUBTRACT";
                break;
            case KeyEvent.KEYCODE_NUMPAD_ADD:
                keyCodeString = "NUMPAD_ADD";
                break;
            case KeyEvent.KEYCODE_NUMPAD_DOT:
                keyCodeString = "NUMPAD_DOT";
                break;
            case KeyEvent.KEYCODE_NUMPAD_COMMA:
                keyCodeString = "NUMPAD_COMMA";
                break;
            case KeyEvent.KEYCODE_NUMPAD_ENTER:
                keyCodeString = "NUMPAD_ENTER";
                break;
            case KeyEvent.KEYCODE_NUMPAD_EQUALS:
                keyCodeString = "NUMPAD_EQUALS";
                break;
            case KeyEvent.KEYCODE_NUMPAD_LEFT_PAREN:
                keyCodeString = "NUMPAD_LEFT_PAREN";
                break;
            case KeyEvent.KEYCODE_NUMPAD_RIGHT_PAREN:
                keyCodeString = "NUMPAD_RIGHT_PAREN";
                break;
            case KeyEvent.KEYCODE_VOLUME_MUTE:
                keyCodeString = "VOLUME_MUTE";
                break;
            case KeyEvent.KEYCODE_INFO:
                keyCodeString = "INFO";
                break;
            case KeyEvent.KEYCODE_CHANNEL_UP:
                keyCodeString = "CHANNEL_UP";
                break;
            case KeyEvent.KEYCODE_CHANNEL_DOWN:
                keyCodeString = "CHANNEL_DOWN";
                break;
            case KeyEvent.KEYCODE_ZOOM_IN:
                keyCodeString = "ZOOM_IN";
                break;
            case KeyEvent.KEYCODE_ZOOM_OUT:
                keyCodeString = "ZOOM_OUT";
                break;
            case KeyEvent.KEYCODE_TV:
                keyCodeString = "TV";
                break;
            case KeyEvent.KEYCODE_WINDOW:
                keyCodeString = "WINDOW";
                break;
            case KeyEvent.KEYCODE_GUIDE:
                keyCodeString = "GUIDE";
                break;
            case KeyEvent.KEYCODE_DVR:
                keyCodeString = "DVR";
                break;
            case KeyEvent.KEYCODE_BOOKMARK:
                keyCodeString = "BOOKMARK";
                break;
            case KeyEvent.KEYCODE_CAPTIONS:
                keyCodeString = "CAPTIONS";
                break;
            case KeyEvent.KEYCODE_SETTINGS:
                keyCodeString = "SETTINGS";
                break;
            case KeyEvent.KEYCODE_TV_POWER:
                keyCodeString = "TV_POWER";
                break;
            case KeyEvent.KEYCODE_TV_INPUT:
                keyCodeString = "TV_INPUT";
                break;
            case KeyEvent.KEYCODE_STB_POWER:
                keyCodeString = "STB_POWER";
                break;
            case KeyEvent.KEYCODE_STB_INPUT:
                keyCodeString = "STB_INPUT";
                break;
            case KeyEvent.KEYCODE_AVR_POWER:
                keyCodeString = "AVR_POWER";
                break;
            case KeyEvent.KEYCODE_AVR_INPUT:
                keyCodeString = "AVR_INPUT";
                break;
            case KeyEvent.KEYCODE_PROG_RED:
                keyCodeString = "PROG_RED";
                break;
            case KeyEvent.KEYCODE_PROG_GREEN:
                keyCodeString = "PROG_GREEN";
                break;
            case KeyEvent.KEYCODE_PROG_YELLOW:
                keyCodeString = "PROG_YELLOW";
                break;
            case KeyEvent.KEYCODE_PROG_BLUE:
                keyCodeString = "PROG_BLUE";
                break;
            case KeyEvent.KEYCODE_APP_SWITCH:
                keyCodeString = "APP_SWITCH";
                break;
            case KeyEvent.KEYCODE_BUTTON_1:
                keyCodeString = "BUTTON_1";
                break;
            case KeyEvent.KEYCODE_BUTTON_2:
                keyCodeString = "BUTTON_2";
                break;
            case KeyEvent.KEYCODE_BUTTON_3:
                keyCodeString = "BUTTON_3";
                break;
            case KeyEvent.KEYCODE_BUTTON_4:
                keyCodeString = "BUTTON_4";
                break;
            case KeyEvent.KEYCODE_BUTTON_5:
                keyCodeString = "BUTTON_5";
                break;
            case KeyEvent.KEYCODE_BUTTON_6:
                keyCodeString = "BUTTON_6";
                break;
            case KeyEvent.KEYCODE_BUTTON_7:
                keyCodeString = "BUTTON_7";
                break;
            case KeyEvent.KEYCODE_BUTTON_8:
                keyCodeString = "BUTTON_8";
                break;
            case KeyEvent.KEYCODE_BUTTON_9:
                keyCodeString = "BUTTON_9";
                break;
            case KeyEvent.KEYCODE_BUTTON_10:
                keyCodeString = "BUTTON_10";
                break;
            case KeyEvent.KEYCODE_BUTTON_11:
                keyCodeString = "BUTTON_11";
                break;
            case KeyEvent.KEYCODE_BUTTON_12:
                keyCodeString = "BUTTON_12";
                break;
            case KeyEvent.KEYCODE_BUTTON_13:
                keyCodeString = "BUTTON_13";
                break;
            case KeyEvent.KEYCODE_BUTTON_14:
                keyCodeString = "BUTTON_14";
                break;
            case KeyEvent.KEYCODE_BUTTON_15:
                keyCodeString = "BUTTON_15";
                break;
            case KeyEvent.KEYCODE_BUTTON_16:
                keyCodeString = "BUTTON_16";
                break;
            case KeyEvent.KEYCODE_LANGUAGE_SWITCH:
                keyCodeString = "LANGUAGE_SWITCH";
                break;
            case KeyEvent.KEYCODE_MANNER_MODE:
                keyCodeString = "MANNER_MODE";
                break;
            case KeyEvent.KEYCODE_3D_MODE:
                keyCodeString = "3D_MODE";
                break;
            case KeyEvent.KEYCODE_CONTACTS:
                keyCodeString = "CONTACTS";
                break;
            case KeyEvent.KEYCODE_CALENDAR:
                keyCodeString = "CALENDAR";
                break;
            case KeyEvent.KEYCODE_MUSIC:
                keyCodeString = "MUSIC";
                break;
            case KeyEvent.KEYCODE_CALCULATOR:
                keyCodeString = "CALCULATOR";
                break;
            case KeyEvent.KEYCODE_ZENKAKU_HANKAKU:
                keyCodeString = "ZENKAKU_HANKAKU";
                break;
            case KeyEvent.KEYCODE_EISU:
                keyCodeString = "EISU";
                break;
            case KeyEvent.KEYCODE_MUHENKAN:
                keyCodeString = "MUHENKAN";
                break;
            case KeyEvent.KEYCODE_HENKAN:
                keyCodeString = "HENKAN";
                break;
            case KeyEvent.KEYCODE_KATAKANA_HIRAGANA:
                keyCodeString = "KATAKANA_HIRAGANA";
                break;
            case KeyEvent.KEYCODE_YEN:
                keyCodeString = "YEN";
                break;
            case KeyEvent.KEYCODE_RO:
                keyCodeString = "RO";
                break;
            case KeyEvent.KEYCODE_KANA:
                keyCodeString = "KANA";
                break;
            case KeyEvent.KEYCODE_ASSIST:
                keyCodeString = "ASSIST";
                break;
            case KeyEvent.KEYCODE_BRIGHTNESS_DOWN:
                keyCodeString = "BRIGHTNESS_DOWN";
                break;
            case KeyEvent.KEYCODE_BRIGHTNESS_UP:
                keyCodeString = "BRIGHTNESS_UP";
                break;
            case KeyEvent.KEYCODE_MEDIA_AUDIO_TRACK:
                keyCodeString = "MEDIA_AUDIO_TRACK";
                break;
            case KeyEvent.KEYCODE_SLEEP:
                keyCodeString = "SLEEP";
                break;
            case KeyEvent.KEYCODE_WAKEUP:
                keyCodeString = "WAKEUP";
                break;
            case KeyEvent.KEYCODE_PAIRING:
                keyCodeString = "PAIRING";
                break;
            case KeyEvent.KEYCODE_MEDIA_TOP_MENU:
                keyCodeString = "MEDIA_TOP_MENU";
                break;
            case KeyEvent.KEYCODE_11:
                keyCodeString = "11";
                break;
            case KeyEvent.KEYCODE_12:
                keyCodeString = "12";
                break;
            case KeyEvent.KEYCODE_LAST_CHANNEL:
                keyCodeString = "LAST_CHANNEL";
                break;
            case KeyEvent.KEYCODE_TV_DATA_SERVICE:
                keyCodeString = "TV_DATA_SERVICE";
                break;
            case KeyEvent.KEYCODE_VOICE_ASSIST:
                keyCodeString = "VOICE_ASSIST";
                break;
            case KeyEvent.KEYCODE_TV_RADIO_SERVICE:
                keyCodeString = "TV_RADIO_SERVICE";
                break;
            case KeyEvent.KEYCODE_TV_TELETEXT:
                keyCodeString = "TV_TELETEXT";
                break;
            case KeyEvent.KEYCODE_TV_NUMBER_ENTRY:
                keyCodeString = "TV_NUMBER_ENTRY";
                break;
            case KeyEvent.KEYCODE_TV_TERRESTRIAL_ANALOG:
                keyCodeString = "TV_TERRESTRIAL_ANALOG";
                break;
            case KeyEvent.KEYCODE_TV_TERRESTRIAL_DIGITAL:
                keyCodeString = "TV_TERRESTRIAL_DIGITAL";
                break;
            case KeyEvent.KEYCODE_TV_SATELLITE:
                keyCodeString = "TV_SATELLITE";
                break;
            case KeyEvent.KEYCODE_TV_SATELLITE_BS:
                keyCodeString = "TV_SATELLITE_BS";
                break;
            case KeyEvent.KEYCODE_TV_SATELLITE_CS:
                keyCodeString = "TV_SATELLITE_CS";
                break;
            case KeyEvent.KEYCODE_TV_SATELLITE_SERVICE:
                keyCodeString = "TV_SATELLITE_SERVICE";
                break;
            case KeyEvent.KEYCODE_TV_NETWORK:
                keyCodeString = "TV_NETWORK";
                break;
            case KeyEvent.KEYCODE_TV_ANTENNA_CABLE:
                keyCodeString = "TV_ANTENNA_CABLE";
                break;
            case KeyEvent.KEYCODE_TV_INPUT_HDMI_1:
                keyCodeString = "TV_INPUT_HDMI_1";
                break;
            case KeyEvent.KEYCODE_TV_INPUT_HDMI_2:
                keyCodeString = "TV_INPUT_HDMI_2";
                break;
            case KeyEvent.KEYCODE_TV_INPUT_HDMI_3:
                keyCodeString = "TV_INPUT_HDMI_3";
                break;
            case KeyEvent.KEYCODE_TV_INPUT_HDMI_4:
                keyCodeString = "TV_INPUT_HDMI_4";
                break;
            case KeyEvent.KEYCODE_TV_INPUT_COMPOSITE_1:
                keyCodeString = "TV_INPUT_COMPOSITE_1";
                break;
            case KeyEvent.KEYCODE_TV_INPUT_COMPOSITE_2:
                keyCodeString = "TV_INPUT_COMPOSITE_2";
                break;
            case KeyEvent.KEYCODE_TV_INPUT_COMPONENT_1:
                keyCodeString = "TV_INPUT_COMPONENT_1";
                break;
            case KeyEvent.KEYCODE_TV_INPUT_COMPONENT_2:
                keyCodeString = "TV_INPUT_COMPONENT_2";
                break;
            case KeyEvent.KEYCODE_TV_INPUT_VGA_1:
                keyCodeString = "TV_INPUT_VGA_1";
                break;
            case KeyEvent.KEYCODE_TV_AUDIO_DESCRIPTION:
                keyCodeString = "TV_AUDIO_DESCRIPTION";
                break;
            case KeyEvent.KEYCODE_TV_AUDIO_DESCRIPTION_MIX_UP:
                keyCodeString = "TV_AUDIO_DESCRIPTION_MIX_UP";
                break;
            case KeyEvent.KEYCODE_TV_AUDIO_DESCRIPTION_MIX_DOWN:
                keyCodeString = "TV_AUDIO_DESCRIPTION_MIX_DOWN";
                break;
            case KeyEvent.KEYCODE_TV_ZOOM_MODE:
                keyCodeString = "TV_ZOOM_MODE";
                break;
            case KeyEvent.KEYCODE_TV_CONTENTS_MENU:
                keyCodeString = "TV_CONTENTS_MENU";
                break;
            case KeyEvent.KEYCODE_TV_MEDIA_CONTEXT_MENU:
                keyCodeString = "TV_MEDIA_CONTEXT_MENU";
                break;
            case KeyEvent.KEYCODE_TV_TIMER_PROGRAMMING:
                keyCodeString = "TV_TIMER_PROGRAMMING";
                break;
            case KeyEvent.KEYCODE_HELP:
                keyCodeString = "HELP";
                break;
            case KeyEvent.KEYCODE_NAVIGATE_PREVIOUS:
                keyCodeString = "NAVIGATE_PREVIOUS";
                break;
            case KeyEvent.KEYCODE_NAVIGATE_NEXT:
                keyCodeString = "NAVIGATE_NEXT";
                break;
            case KeyEvent.KEYCODE_NAVIGATE_IN:
                keyCodeString = "NAVIGATE_IN";
                break;
            case KeyEvent.KEYCODE_NAVIGATE_OUT:
                keyCodeString = "NAVIGATE_OUT";
                break;
            case KeyEvent.KEYCODE_STEM_PRIMARY:
                keyCodeString = "STEM_PRIMARY";
                break;
            case KeyEvent.KEYCODE_STEM_1:
                keyCodeString = "STEM_1";
                break;
            case KeyEvent.KEYCODE_STEM_2:
                keyCodeString = "STEM_2";
                break;
            case KeyEvent.KEYCODE_STEM_3:
                keyCodeString = "STEM_3";
                break;
            case KeyEvent.KEYCODE_DPAD_UP_LEFT:
                keyCodeString = "DPAD_UP_LEFT";
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN_LEFT:
                keyCodeString = "DPAD_DOWN_LEFT";
                break;
            case KeyEvent.KEYCODE_DPAD_UP_RIGHT:
                keyCodeString = "DPAD_UP_RIGHT";
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN_RIGHT:
                keyCodeString = "DPAD_DOWN_RIGHT";
                break;
            case KeyEvent.KEYCODE_MEDIA_SKIP_FORWARD:
                keyCodeString = "MEDIA_SKIP_FORWARD";
                break;
            case KeyEvent.KEYCODE_MEDIA_SKIP_BACKWARD:
                keyCodeString = "MEDIA_SKIP_BACKWARD";
                break;
            case KeyEvent.KEYCODE_MEDIA_STEP_FORWARD:
                keyCodeString = "MEDIA_STEP_FORWARD";
                break;
            case KeyEvent.KEYCODE_MEDIA_STEP_BACKWARD:
                keyCodeString = "MEDIA_STEP_BACKWARD";
                break;
            case KeyEvent.KEYCODE_SOFT_SLEEP:
                keyCodeString = "SOFT_SLEEP";
                break;
            case KeyEvent.KEYCODE_CUT:
                keyCodeString = "CUT";
                break;
            case KeyEvent.KEYCODE_COPY:
                keyCodeString = "COPY";
                break;
            case KeyEvent.KEYCODE_PASTE:
                keyCodeString = "PASTE";
                break;
            default:
            case KeyEvent.KEYCODE_UNKNOWN:
                keyCodeString = "KEYCODE_UNKNOWN";
                break;
        }

        // Show the keycode on the screen
        centerText.setText(keyCodeString);

        return super.onKeyDown(keyCode, event);
    }
}
