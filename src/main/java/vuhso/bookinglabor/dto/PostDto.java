package vuhso.bookinglabor.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

//AUTHOR:VuHSO
//                           _
//                        _ooOoo_
//                       o8888888o
//                       88" . "88
//                       (| -_- |)
//                       O\  =  /O
//                    ____/`---'\____
//                  .'  \\|     |//  `.
//                 /  \\|||  :  |||//  \
//                /  _||||| -:- |||||_  \
//                |   | \\\  -  /'| |   |
//                | \_|  `\`---'//  |_/ |
//                \  .-\__ `-. -'__/-.  /
//              ___`. .'  /--.--\  `. .'___
//           ."" '<  `.___\_<|>_/___.' _> \"".
//          | | :  `- \`. ;`. _/; .'/ /  .' ; |
//          \  \ `-.   \_\_`. _.'_/_/  -' _.' /
//===========`-.`___`-.__\ \___  /__.-'_.'_.-'================
//                        `=--=-'
//=========== Phật phù hộ không bao giờ BUG ===================

@Getter
@Setter

public class PostDto {
    //DTO : Data Tranfer Object
    // Use to transfer data between layers
    // Use to transfer data between services
    // cho client xem thông tin

    private Long id;
    private String title;
    private String content;
    private String image;
    private String author;
    private String minDate;
    private String maxDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
