package me.fandong.live.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class LiveResponseEntry {



    @SerializedName("dm_error")
    private Integer dmError;
    @SerializedName("error_msg")
    private String errorMsg;
    @SerializedName("has_more")
    private Integer hasMore;
    @SerializedName("offset")
    private Integer offset;
    @SerializedName("data")
    private List<Data> data;

    public Integer getDmError() {
        return dmError;
    }

    public void setDmError(Integer dmError) {
        this.dmError = dmError;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getHasMore() {
        return hasMore;
    }

    public void setHasMore(Integer hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data {
        /**
         * live_info : {"bg_image":"","bg_image_type":"","city":"","cover":"","creator":{"age":20,"albums":["http://img.ikstatic.cn/MTYwMTM4MTA0NTAxMiM5NjcjanBn.jpg","http://img.ikstatic.cn/MTYwNDA0NDQzODgxMSMgMjEjanBn.jpg"],"birth":"2001-11-23","current_value":"21760","description":"可可爱爱","emotion":"保密","gender":0,"gmutex":0,"height":168,"hometown":"湖南省&长沙市","id":749584907,"inke_verify":1,"introduction_v2":null,"last_audio_desc_stat":0,"level":17,"liverank":{"dis_score":118594,"isLevel":0,"is_gray":0,"level":27,"level_maxed":0,"old_res":0,"pic":"http://img2.inke.cn/MTQ5NzU5ODE0NDUzOSM2NzEjanBn.jpg","privilege_total_count":3,"privilege_unlock_count":2,"rate":0.011716666666666667,"score":601406,"stage_match":null,"uid":749584907},"location":"长沙","next_diff":"3740","nick":"湘湘kaya","portrait":"http://img.ikstatic.cn/MTYwMjE2NDYwNDU2NCM4NDkjanBn.jpg","profession":"影视/娱乐","rank_veri":273,"register_at":1600612845,"sex":0,"stat":67,"third_platform":"","unlock_privilege_count":0,"unset_stat":0,"veri_info":"舞蹈频道 闪亮红人","verified":273,"verified_prefix":"认证: ","verified_reason":"舞蹈频道 闪亮红人","verify_extra":null,"verify_list":[{"expire_at":32503651199,"expire_at_str":"","id":273,"is_selected":true,"reason":"舞蹈频道 闪亮红人","type":"channel","verified_prefix":""},{"expire_at":1608175266,"expire_at_str":"","id":1129,"is_selected":false,"reason":"冰雪世界","type":"activity","verified_prefix":""},{"expire_at":1608132207,"expire_at_str":"","id":1128,"is_selected":false,"reason":"冰雪宝藏","type":"activity","verified_prefix":""},{"expire_at":1608119590,"expire_at_str":"","id":1127,"is_selected":false,"reason":"冰雪奇缘","type":"activity","verified_prefix":""},{"expire_at":1608086522,"expire_at_str":"","id":1126,"is_selected":false,"reason":"冰雪精灵","type":"activity","verified_prefix":""}],"vip_info":{"copywriting":"映客VIP重磅上线 多种权益低价享","end_date":"1970-01-01","end_time":"1970-01-01T08:00:00+08:00","is_display":true,"is_vip":false,"public_chat_vip_icon":"","vip_icon":"https://img.ikstatic.cn/MTYwNTI0OTczNzI5MCM2MjgjcG5n.png","vip_tab":"https://boc.inke.cn/react/innerapp-2020/vip/entry/index.html?from=me&isWebFullScreen=true&isBatteryWhite=true&isShowCustomNavBar=true"},"want_type":"看感觉","wechat_info":{"stat":0},"weight":57},"default_bg_image":"","distance":"长沙市","end_time":0,"extra":{"cover":null,"label":[]},"extra_stream_addrs":[{"id":"1606973619032885","link":0,"multi":0,"quality":1,"sharpness":"高清","stream_addr":"http://bssource.rtc.inke.cn/live/1606973619032885.flv?auth_version=1&codecInfo=8192&dpSrc=6&from=hallfe&ikChorus=1&ikDnsOp=1&ikFastRate=1.1&ikHost=bsy&ikLiveType=normal&ikLog=1&ikMaxBuf=3600&ikMinBuf=2900&ikNetOp=01111&ikOp=0&ikSlowRate=0.9&ikSyncBeta=1&md5sum=7704&msUid=313054160&pushHost=clsTrans.push.cls.inke.cn&timestamp=1606974352"}],"gps_position":"113.002156,28.140500","group":0,"id":"1606973619032885","image":"","label_tags":{"posa":null,"posb":{"text":""},"posc":{"text":"跳舞啦～"},"posd":{"end_color":"#AD000000","frame":"#00000000","icon":"http://img.ikstatic.cn/MTU2NzUxODg5NzU0MyM5MzYjcG5n.png","start_color":"#AD000000"},"posh":null,"posi":null,"pose":null,"posg":null,"posj":null},"landscape":0,"link":0,"live_type":"","live_type_subordinate":0,"location":"CN,湖南省,长沙市","mode":0,"multi":0,"name":"跳舞啦～","numbers":{"liveid":"1606973619032885","real":323},"online_users":665,"pub_stat":1,"quality":1,"real_number_text":"323#人在看","req_source":0,"room":{"annoncement":"","cover":"","cover_check":"","cover_status":0,"id":0,"liveid":"","name":"","owner":0,"playid":0,"show_room_id":0,"show_room_resource":"","status":0,"title":""},"room_id":123456789,"rotate":0,"share_addr":"https://mlive12.inke.cn/app/hot/live?uid=749584907&liveid=1606973619032885&ctime=1606973619","sharpness":"高清","slot":1,"start_time":1606973630,"status":1,"stream_addr":"http://bssource.rtc.inke.cn/live/1606973619032885.flv?auth_version=1&codecInfo=8192&dpSrc=6&from=hallfe&ikChorus=1&ikDnsOp=1&ikFastRate=1.1&ikHost=bsy&ikLiveType=normal&ikLog=1&ikMaxBuf=3600&ikMinBuf=2900&ikNetOp=01111&ikOp=0&ikSlowRate=0.9&ikSyncBeta=1&md5sum=7704&msUid=313054160&pushHost=clsTrans.push.cls.inke.cn&timestamp=1606974352","stream_multi_addr":"http://wssource.pull.inke.cn/live/1606973619032885_0.flv?ikHost=ws&ikOp=1&codecInfo=8192&dpSrc=push&ikDnsOp=1001&ikNetOp=1111&ikMinBuf=2900&ikMaxBuf=3600&ikSlowRate=0.9&ikFastRate=1.1&ikLog=1&ikSyncBeta=1&ikChorus=1&ikPushTs=1606973619&ikLiveType=normal","sub_live_type":"","token":"rec_16_11_1_1^313054160_1606974352015_3^0^167,146,150,154,145,182|^0^167,146,150,154,145,182","version":0}
         * type :
         */

        @SerializedName("live_info")
        private LiveInfo liveInfo;
        @SerializedName("type")
        private String type;

        public LiveInfo getLiveInfo() {
            return liveInfo;
        }

        public void setLiveInfo(LiveInfo liveInfo) {
            this.liveInfo = liveInfo;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static class LiveInfo implements Serializable {
            /**
             * bg_image :
             * bg_image_type :
             * city :
             * cover :
             * creator : {"age":20,"albums":["http://img.ikstatic.cn/MTYwMTM4MTA0NTAxMiM5NjcjanBn.jpg","http://img.ikstatic.cn/MTYwNDA0NDQzODgxMSMgMjEjanBn.jpg"],"birth":"2001-11-23","current_value":"21760","description":"可可爱爱","emotion":"保密","gender":0,"gmutex":0,"height":168,"hometown":"湖南省&长沙市","id":749584907,"inke_verify":1,"introduction_v2":null,"last_audio_desc_stat":0,"level":17,"liverank":{"dis_score":118594,"isLevel":0,"is_gray":0,"level":27,"level_maxed":0,"old_res":0,"pic":"http://img2.inke.cn/MTQ5NzU5ODE0NDUzOSM2NzEjanBn.jpg","privilege_total_count":3,"privilege_unlock_count":2,"rate":0.011716666666666667,"score":601406,"stage_match":null,"uid":749584907},"location":"长沙","next_diff":"3740","nick":"湘湘kaya","portrait":"http://img.ikstatic.cn/MTYwMjE2NDYwNDU2NCM4NDkjanBn.jpg","profession":"影视/娱乐","rank_veri":273,"register_at":1600612845,"sex":0,"stat":67,"third_platform":"","unlock_privilege_count":0,"unset_stat":0,"veri_info":"舞蹈频道 闪亮红人","verified":273,"verified_prefix":"认证: ","verified_reason":"舞蹈频道 闪亮红人","verify_extra":null,"verify_list":[{"expire_at":32503651199,"expire_at_str":"","id":273,"is_selected":true,"reason":"舞蹈频道 闪亮红人","type":"channel","verified_prefix":""},{"expire_at":1608175266,"expire_at_str":"","id":1129,"is_selected":false,"reason":"冰雪世界","type":"activity","verified_prefix":""},{"expire_at":1608132207,"expire_at_str":"","id":1128,"is_selected":false,"reason":"冰雪宝藏","type":"activity","verified_prefix":""},{"expire_at":1608119590,"expire_at_str":"","id":1127,"is_selected":false,"reason":"冰雪奇缘","type":"activity","verified_prefix":""},{"expire_at":1608086522,"expire_at_str":"","id":1126,"is_selected":false,"reason":"冰雪精灵","type":"activity","verified_prefix":""}],"vip_info":{"copywriting":"映客VIP重磅上线 多种权益低价享","end_date":"1970-01-01","end_time":"1970-01-01T08:00:00+08:00","is_display":true,"is_vip":false,"public_chat_vip_icon":"","vip_icon":"https://img.ikstatic.cn/MTYwNTI0OTczNzI5MCM2MjgjcG5n.png","vip_tab":"https://boc.inke.cn/react/innerapp-2020/vip/entry/index.html?from=me&isWebFullScreen=true&isBatteryWhite=true&isShowCustomNavBar=true"},"want_type":"看感觉","wechat_info":{"stat":0},"weight":57}
             * default_bg_image :
             * distance : 长沙市
             * end_time : 0
             * extra : {"cover":null,"label":[]}
             * extra_stream_addrs : [{"id":"1606973619032885","link":0,"multi":0,"quality":1,"sharpness":"高清","stream_addr":"http://bssource.rtc.inke.cn/live/1606973619032885.flv?auth_version=1&codecInfo=8192&dpSrc=6&from=hallfe&ikChorus=1&ikDnsOp=1&ikFastRate=1.1&ikHost=bsy&ikLiveType=normal&ikLog=1&ikMaxBuf=3600&ikMinBuf=2900&ikNetOp=01111&ikOp=0&ikSlowRate=0.9&ikSyncBeta=1&md5sum=7704&msUid=313054160&pushHost=clsTrans.push.cls.inke.cn&timestamp=1606974352"}]
             * gps_position : 113.002156,28.140500
             * group : 0
             * id : 1606973619032885
             * image :
             * label_tags : {"posa":null,"posb":{"text":""},"posc":{"text":"跳舞啦～"},"posd":{"end_color":"#AD000000","frame":"#00000000","icon":"http://img.ikstatic.cn/MTU2NzUxODg5NzU0MyM5MzYjcG5n.png","start_color":"#AD000000"},"posh":null,"posi":null,"pose":null,"posg":null,"posj":null}
             * landscape : 0
             * link : 0
             * live_type :
             * live_type_subordinate : 0
             * location : CN,湖南省,长沙市
             * mode : 0
             * multi : 0
             * name : 跳舞啦～
             * numbers : {"liveid":"1606973619032885","real":323}
             * online_users : 665
             * pub_stat : 1
             * quality : 1
             * real_number_text : 323#人在看
             * req_source : 0
             * room : {"annoncement":"","cover":"","cover_check":"","cover_status":0,"id":0,"liveid":"","name":"","owner":0,"playid":0,"show_room_id":0,"show_room_resource":"","status":0,"title":""}
             * room_id : 123456789
             * rotate : 0
             * share_addr : https://mlive12.inke.cn/app/hot/live?uid=749584907&liveid=1606973619032885&ctime=1606973619
             * sharpness : 高清
             * slot : 1
             * start_time : 1606973630
             * status : 1
             * stream_addr : http://bssource.rtc.inke.cn/live/1606973619032885.flv?auth_version=1&codecInfo=8192&dpSrc=6&from=hallfe&ikChorus=1&ikDnsOp=1&ikFastRate=1.1&ikHost=bsy&ikLiveType=normal&ikLog=1&ikMaxBuf=3600&ikMinBuf=2900&ikNetOp=01111&ikOp=0&ikSlowRate=0.9&ikSyncBeta=1&md5sum=7704&msUid=313054160&pushHost=clsTrans.push.cls.inke.cn&timestamp=1606974352
             * stream_multi_addr : http://wssource.pull.inke.cn/live/1606973619032885_0.flv?ikHost=ws&ikOp=1&codecInfo=8192&dpSrc=push&ikDnsOp=1001&ikNetOp=1111&ikMinBuf=2900&ikMaxBuf=3600&ikSlowRate=0.9&ikFastRate=1.1&ikLog=1&ikSyncBeta=1&ikChorus=1&ikPushTs=1606973619&ikLiveType=normal
             * sub_live_type :
             * token : rec_16_11_1_1^313054160_1606974352015_3^0^167,146,150,154,145,182|^0^167,146,150,154,145,182
             * version : 0
             */

            @SerializedName("bg_image")
            private String bgImage;
            @SerializedName("bg_image_type")
            private String bgImageType;
            @SerializedName("city")
            private String city;
            @SerializedName("cover")
            private String cover;
            @SerializedName("creator")
            private Creator creator;
            @SerializedName("default_bg_image")
            private String defaultBgImage;
            @SerializedName("distance")
            private String distance;
            @SerializedName("end_time")
            private Integer endTime;
            @SerializedName("extra")
            private Extra extra;
            @SerializedName("gps_position")
            private String gpsPosition;
            @SerializedName("group")
            private Integer group;
            @SerializedName("id")
            private String id;
            @SerializedName("image")
            private String image;
            @SerializedName("label_tags")
            private LabelTags labelTags;
            @SerializedName("landscape")
            private Integer landscape;
            @SerializedName("link")
            private Integer link;
            @SerializedName("live_type")
            private String liveType;
            @SerializedName("live_type_subordinate")
            private Integer liveTypeSubordinate;
            @SerializedName("location")
            private String location;
            @SerializedName("mode")
            private Integer mode;
            @SerializedName("multi")
            private Integer multi;
            @SerializedName("name")
            private String name;
            @SerializedName("numbers")
            private Numbers numbers;
            @SerializedName("online_users")
            private Integer onlineUsers;
            @SerializedName("pub_stat")
            private Integer pubStat;
            @SerializedName("quality")
            private Integer quality;
            @SerializedName("real_number_text")
            private String realNumberText;
            @SerializedName("req_source")
            private Integer reqSource;
            @SerializedName("room")
            private Room room;
            @SerializedName("room_id")
            private Integer roomId;
            @SerializedName("rotate")
            private Integer rotate;
            @SerializedName("share_addr")
            private String shareAddr;
            @SerializedName("sharpness")
            private String sharpness;
            @SerializedName("slot")
            private Integer slot;
            @SerializedName("start_time")
            private Integer startTime;
            @SerializedName("status")
            private Integer status;
            @SerializedName("stream_addr")
            private String streamAddr;
            @SerializedName("stream_multi_addr")
            private String streamMultiAddr;
            @SerializedName("sub_live_type")
            private String subLiveType;
            @SerializedName("token")
            private String token;
            @SerializedName("version")
            private Integer version;
            @SerializedName("extra_stream_addrs")
            private List<ExtraStreamAddrs> extraStreamAddrs;

            public String getBgImage() {
                return bgImage;
            }

            public void setBgImage(String bgImage) {
                this.bgImage = bgImage;
            }

            public String getBgImageType() {
                return bgImageType;
            }

            public void setBgImageType(String bgImageType) {
                this.bgImageType = bgImageType;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public Creator getCreator() {
                return creator;
            }

            public void setCreator(Creator creator) {
                this.creator = creator;
            }

            public String getDefaultBgImage() {
                return defaultBgImage;
            }

            public void setDefaultBgImage(String defaultBgImage) {
                this.defaultBgImage = defaultBgImage;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public Integer getEndTime() {
                return endTime;
            }

            public void setEndTime(Integer endTime) {
                this.endTime = endTime;
            }

            public Extra getExtra() {
                return extra;
            }

            public void setExtra(Extra extra) {
                this.extra = extra;
            }

            public String getGpsPosition() {
                return gpsPosition;
            }

            public void setGpsPosition(String gpsPosition) {
                this.gpsPosition = gpsPosition;
            }

            public Integer getGroup() {
                return group;
            }

            public void setGroup(Integer group) {
                this.group = group;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public LabelTags getLabelTags() {
                return labelTags;
            }

            public void setLabelTags(LabelTags labelTags) {
                this.labelTags = labelTags;
            }

            public Integer getLandscape() {
                return landscape;
            }

            public void setLandscape(Integer landscape) {
                this.landscape = landscape;
            }

            public Integer getLink() {
                return link;
            }

            public void setLink(Integer link) {
                this.link = link;
            }

            public String getLiveType() {
                return liveType;
            }

            public void setLiveType(String liveType) {
                this.liveType = liveType;
            }

            public Integer getLiveTypeSubordinate() {
                return liveTypeSubordinate;
            }

            public void setLiveTypeSubordinate(Integer liveTypeSubordinate) {
                this.liveTypeSubordinate = liveTypeSubordinate;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public Integer getMode() {
                return mode;
            }

            public void setMode(Integer mode) {
                this.mode = mode;
            }

            public Integer getMulti() {
                return multi;
            }

            public void setMulti(Integer multi) {
                this.multi = multi;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Numbers getNumbers() {
                return numbers;
            }

            public void setNumbers(Numbers numbers) {
                this.numbers = numbers;
            }

            public Integer getOnlineUsers() {
                return onlineUsers;
            }

            public void setOnlineUsers(Integer onlineUsers) {
                this.onlineUsers = onlineUsers;
            }

            public Integer getPubStat() {
                return pubStat;
            }

            public void setPubStat(Integer pubStat) {
                this.pubStat = pubStat;
            }

            public Integer getQuality() {
                return quality;
            }

            public void setQuality(Integer quality) {
                this.quality = quality;
            }

            public String getRealNumberText() {
                return realNumberText;
            }

            public void setRealNumberText(String realNumberText) {
                this.realNumberText = realNumberText;
            }

            public Integer getReqSource() {
                return reqSource;
            }

            public void setReqSource(Integer reqSource) {
                this.reqSource = reqSource;
            }

            public Room getRoom() {
                return room;
            }

            public void setRoom(Room room) {
                this.room = room;
            }

            public Integer getRoomId() {
                return roomId;
            }

            public void setRoomId(Integer roomId) {
                this.roomId = roomId;
            }

            public Integer getRotate() {
                return rotate;
            }

            public void setRotate(Integer rotate) {
                this.rotate = rotate;
            }

            public String getShareAddr() {
                return shareAddr;
            }

            public void setShareAddr(String shareAddr) {
                this.shareAddr = shareAddr;
            }

            public String getSharpness() {
                return sharpness;
            }

            public void setSharpness(String sharpness) {
                this.sharpness = sharpness;
            }

            public Integer getSlot() {
                return slot;
            }

            public void setSlot(Integer slot) {
                this.slot = slot;
            }

            public Integer getStartTime() {
                return startTime;
            }

            public void setStartTime(Integer startTime) {
                this.startTime = startTime;
            }

            public Integer getStatus() {
                return status;
            }

            public void setStatus(Integer status) {
                this.status = status;
            }

            public String getStreamAddr() {
                return streamAddr;
            }

            public void setStreamAddr(String streamAddr) {
                this.streamAddr = streamAddr;
            }

            public String getStreamMultiAddr() {
                return streamMultiAddr;
            }

            public void setStreamMultiAddr(String streamMultiAddr) {
                this.streamMultiAddr = streamMultiAddr;
            }

            public String getSubLiveType() {
                return subLiveType;
            }

            public void setSubLiveType(String subLiveType) {
                this.subLiveType = subLiveType;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public Integer getVersion() {
                return version;
            }

            public void setVersion(Integer version) {
                this.version = version;
            }

            public List<ExtraStreamAddrs> getExtraStreamAddrs() {
                return extraStreamAddrs;
            }

            public void setExtraStreamAddrs(List<ExtraStreamAddrs> extraStreamAddrs) {
                this.extraStreamAddrs = extraStreamAddrs;
            }

            public static class Creator {
                /**
                 * age : 20
                 * albums : ["http://img.ikstatic.cn/MTYwMTM4MTA0NTAxMiM5NjcjanBn.jpg","http://img.ikstatic.cn/MTYwNDA0NDQzODgxMSMgMjEjanBn.jpg"]
                 * birth : 2001-11-23
                 * current_value : 21760
                 * description : 可可爱爱
                 * emotion : 保密
                 * gender : 0
                 * gmutex : 0
                 * height : 168
                 * hometown : 湖南省&长沙市
                 * id : 749584907
                 * inke_verify : 1
                 * introduction_v2 : null
                 * last_audio_desc_stat : 0
                 * level : 17
                 * liverank : {"dis_score":118594,"isLevel":0,"is_gray":0,"level":27,"level_maxed":0,"old_res":0,"pic":"http://img2.inke.cn/MTQ5NzU5ODE0NDUzOSM2NzEjanBn.jpg","privilege_total_count":3,"privilege_unlock_count":2,"rate":0.011716666666666667,"score":601406,"stage_match":null,"uid":749584907}
                 * location : 长沙
                 * next_diff : 3740
                 * nick : 湘湘kaya
                 * portrait : http://img.ikstatic.cn/MTYwMjE2NDYwNDU2NCM4NDkjanBn.jpg
                 * profession : 影视/娱乐
                 * rank_veri : 273
                 * register_at : 1600612845
                 * sex : 0
                 * stat : 67
                 * third_platform :
                 * unlock_privilege_count : 0
                 * unset_stat : 0
                 * veri_info : 舞蹈频道 闪亮红人
                 * verified : 273
                 * verified_prefix : 认证:
                 * verified_reason : 舞蹈频道 闪亮红人
                 * verify_extra : null
                 * verify_list : [{"expire_at":32503651199,"expire_at_str":"","id":273,"is_selected":true,"reason":"舞蹈频道 闪亮红人","type":"channel","verified_prefix":""},{"expire_at":1608175266,"expire_at_str":"","id":1129,"is_selected":false,"reason":"冰雪世界","type":"activity","verified_prefix":""},{"expire_at":1608132207,"expire_at_str":"","id":1128,"is_selected":false,"reason":"冰雪宝藏","type":"activity","verified_prefix":""},{"expire_at":1608119590,"expire_at_str":"","id":1127,"is_selected":false,"reason":"冰雪奇缘","type":"activity","verified_prefix":""},{"expire_at":1608086522,"expire_at_str":"","id":1126,"is_selected":false,"reason":"冰雪精灵","type":"activity","verified_prefix":""}]
                 * vip_info : {"copywriting":"映客VIP重磅上线 多种权益低价享","end_date":"1970-01-01","end_time":"1970-01-01T08:00:00+08:00","is_display":true,"is_vip":false,"public_chat_vip_icon":"","vip_icon":"https://img.ikstatic.cn/MTYwNTI0OTczNzI5MCM2MjgjcG5n.png","vip_tab":"https://boc.inke.cn/react/innerapp-2020/vip/entry/index.html?from=me&isWebFullScreen=true&isBatteryWhite=true&isShowCustomNavBar=true"}
                 * want_type : 看感觉
                 * wechat_info : {"stat":0}
                 * weight : 57
                 */

                @SerializedName("age")
                private Integer age;
                @SerializedName("birth")
                private String birth;
                @SerializedName("current_value")
                private String currentValue;
                @SerializedName("description")
                private String description;
                @SerializedName("emotion")
                private String emotion;
                @SerializedName("gender")
                private Integer gender;
                @SerializedName("gmutex")
                private Integer gmutex;
                @SerializedName("height")
                private Integer height;
                @SerializedName("hometown")
                private String hometown;
                @SerializedName("id")
                private Integer id;
                @SerializedName("inke_verify")
                private Integer inkeVerify;
                @SerializedName("introduction_v2")
                private Object introductionV2;
                @SerializedName("last_audio_desc_stat")
                private Integer lastAudioDescStat;
                @SerializedName("level")
                private Integer level;
                @SerializedName("liverank")
                private Liverank liverank;
                @SerializedName("location")
                private String location;
                @SerializedName("next_diff")
                private String nextDiff;
                @SerializedName("nick")
                private String nick;
                @SerializedName("portrait")
                private String portrait;
                @SerializedName("profession")
                private String profession;
                @SerializedName("rank_veri")
                private Integer rankVeri;
                @SerializedName("register_at")
                private Integer registerAt;
                @SerializedName("sex")
                private Integer sex;
                @SerializedName("stat")
                private Integer stat;
                @SerializedName("third_platform")
                private String thirdPlatform;
                @SerializedName("unlock_privilege_count")
                private Integer unlockPrivilegeCount;
                @SerializedName("unset_stat")
                private Integer unsetStat;
                @SerializedName("veri_info")
                private String veriInfo;
                @SerializedName("verified")
                private Integer verified;
                @SerializedName("verified_prefix")
                private String verifiedPrefix;
                @SerializedName("verified_reason")
                private String verifiedReason;
                @SerializedName("verify_extra")
                private Object verifyExtra;
                @SerializedName("vip_info")
                private VipInfo vipInfo;
                @SerializedName("want_type")
                private String wantType;
                @SerializedName("wechat_info")
                private WechatInfo wechatInfo;
                @SerializedName("weight")
                private Integer weight;
                @SerializedName("albums")
                private List<String> albums;
                @SerializedName("verify_list")
                private List<VerifyList> verifyList;

                public Integer getAge() {
                    return age;
                }

                public void setAge(Integer age) {
                    this.age = age;
                }

                public String getBirth() {
                    return birth;
                }

                public void setBirth(String birth) {
                    this.birth = birth;
                }

                public String getCurrentValue() {
                    return currentValue;
                }

                public void setCurrentValue(String currentValue) {
                    this.currentValue = currentValue;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getEmotion() {
                    return emotion;
                }

                public void setEmotion(String emotion) {
                    this.emotion = emotion;
                }

                public Integer getGender() {
                    return gender;
                }

                public void setGender(Integer gender) {
                    this.gender = gender;
                }

                public Integer getGmutex() {
                    return gmutex;
                }

                public void setGmutex(Integer gmutex) {
                    this.gmutex = gmutex;
                }

                public Integer getHeight() {
                    return height;
                }

                public void setHeight(Integer height) {
                    this.height = height;
                }

                public String getHometown() {
                    return hometown;
                }

                public void setHometown(String hometown) {
                    this.hometown = hometown;
                }

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public Integer getInkeVerify() {
                    return inkeVerify;
                }

                public void setInkeVerify(Integer inkeVerify) {
                    this.inkeVerify = inkeVerify;
                }

                public Object getIntroductionV2() {
                    return introductionV2;
                }

                public void setIntroductionV2(Object introductionV2) {
                    this.introductionV2 = introductionV2;
                }

                public Integer getLastAudioDescStat() {
                    return lastAudioDescStat;
                }

                public void setLastAudioDescStat(Integer lastAudioDescStat) {
                    this.lastAudioDescStat = lastAudioDescStat;
                }

                public Integer getLevel() {
                    return level;
                }

                public void setLevel(Integer level) {
                    this.level = level;
                }

                public Liverank getLiverank() {
                    return liverank;
                }

                public void setLiverank(Liverank liverank) {
                    this.liverank = liverank;
                }

                public String getLocation() {
                    return location;
                }

                public void setLocation(String location) {
                    this.location = location;
                }

                public String getNextDiff() {
                    return nextDiff;
                }

                public void setNextDiff(String nextDiff) {
                    this.nextDiff = nextDiff;
                }

                public String getNick() {
                    return nick;
                }

                public void setNick(String nick) {
                    this.nick = nick;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getProfession() {
                    return profession;
                }

                public void setProfession(String profession) {
                    this.profession = profession;
                }

                public Integer getRankVeri() {
                    return rankVeri;
                }

                public void setRankVeri(Integer rankVeri) {
                    this.rankVeri = rankVeri;
                }

                public Integer getRegisterAt() {
                    return registerAt;
                }

                public void setRegisterAt(Integer registerAt) {
                    this.registerAt = registerAt;
                }

                public Integer getSex() {
                    return sex;
                }

                public void setSex(Integer sex) {
                    this.sex = sex;
                }

                public Integer getStat() {
                    return stat;
                }

                public void setStat(Integer stat) {
                    this.stat = stat;
                }

                public String getThirdPlatform() {
                    return thirdPlatform;
                }

                public void setThirdPlatform(String thirdPlatform) {
                    this.thirdPlatform = thirdPlatform;
                }

                public Integer getUnlockPrivilegeCount() {
                    return unlockPrivilegeCount;
                }

                public void setUnlockPrivilegeCount(Integer unlockPrivilegeCount) {
                    this.unlockPrivilegeCount = unlockPrivilegeCount;
                }

                public Integer getUnsetStat() {
                    return unsetStat;
                }

                public void setUnsetStat(Integer unsetStat) {
                    this.unsetStat = unsetStat;
                }

                public String getVeriInfo() {
                    return veriInfo;
                }

                public void setVeriInfo(String veriInfo) {
                    this.veriInfo = veriInfo;
                }

                public Integer getVerified() {
                    return verified;
                }

                public void setVerified(Integer verified) {
                    this.verified = verified;
                }

                public String getVerifiedPrefix() {
                    return verifiedPrefix;
                }

                public void setVerifiedPrefix(String verifiedPrefix) {
                    this.verifiedPrefix = verifiedPrefix;
                }

                public String getVerifiedReason() {
                    return verifiedReason;
                }

                public void setVerifiedReason(String verifiedReason) {
                    this.verifiedReason = verifiedReason;
                }

                public Object getVerifyExtra() {
                    return verifyExtra;
                }

                public void setVerifyExtra(Object verifyExtra) {
                    this.verifyExtra = verifyExtra;
                }

                public VipInfo getVipInfo() {
                    return vipInfo;
                }

                public void setVipInfo(VipInfo vipInfo) {
                    this.vipInfo = vipInfo;
                }

                public String getWantType() {
                    return wantType;
                }

                public void setWantType(String wantType) {
                    this.wantType = wantType;
                }

                public WechatInfo getWechatInfo() {
                    return wechatInfo;
                }

                public void setWechatInfo(WechatInfo wechatInfo) {
                    this.wechatInfo = wechatInfo;
                }

                public Integer getWeight() {
                    return weight;
                }

                public void setWeight(Integer weight) {
                    this.weight = weight;
                }

                public List<String> getAlbums() {
                    return albums;
                }

                public void setAlbums(List<String> albums) {
                    this.albums = albums;
                }

                public List<VerifyList> getVerifyList() {
                    return verifyList;
                }

                public void setVerifyList(List<VerifyList> verifyList) {
                    this.verifyList = verifyList;
                }

                public static class Liverank {
                    /**
                     * dis_score : 118594
                     * isLevel : 0
                     * is_gray : 0
                     * level : 27
                     * level_maxed : 0
                     * old_res : 0
                     * pic : http://img2.inke.cn/MTQ5NzU5ODE0NDUzOSM2NzEjanBn.jpg
                     * privilege_total_count : 3
                     * privilege_unlock_count : 2
                     * rate : 0.011716666666666667
                     * score : 601406
                     * stage_match : null
                     * uid : 749584907
                     */

                    @SerializedName("dis_score")
                    private Integer disScore;
                    @SerializedName("isLevel")
                    private Integer isLevel;
                    @SerializedName("is_gray")
                    private Integer isGray;
                    @SerializedName("level")
                    private Integer level;
                    @SerializedName("level_maxed")
                    private Integer levelMaxed;
                    @SerializedName("old_res")
                    private Integer oldRes;
                    @SerializedName("pic")
                    private String pic;
                    @SerializedName("privilege_total_count")
                    private Integer privilegeTotalCount;
                    @SerializedName("privilege_unlock_count")
                    private Integer privilegeUnlockCount;
                    @SerializedName("rate")
                    private Double rate;
                    @SerializedName("score")
                    private Integer score;
                    @SerializedName("stage_match")
                    private Object stageMatch;
                    @SerializedName("uid")
                    private Integer uid;

                    public Integer getDisScore() {
                        return disScore;
                    }

                    public void setDisScore(Integer disScore) {
                        this.disScore = disScore;
                    }

                    public Integer getIsLevel() {
                        return isLevel;
                    }

                    public void setIsLevel(Integer isLevel) {
                        this.isLevel = isLevel;
                    }

                    public Integer getIsGray() {
                        return isGray;
                    }

                    public void setIsGray(Integer isGray) {
                        this.isGray = isGray;
                    }

                    public Integer getLevel() {
                        return level;
                    }

                    public void setLevel(Integer level) {
                        this.level = level;
                    }

                    public Integer getLevelMaxed() {
                        return levelMaxed;
                    }

                    public void setLevelMaxed(Integer levelMaxed) {
                        this.levelMaxed = levelMaxed;
                    }

                    public Integer getOldRes() {
                        return oldRes;
                    }

                    public void setOldRes(Integer oldRes) {
                        this.oldRes = oldRes;
                    }

                    public String getPic() {
                        return pic;
                    }

                    public void setPic(String pic) {
                        this.pic = pic;
                    }

                    public Integer getPrivilegeTotalCount() {
                        return privilegeTotalCount;
                    }

                    public void setPrivilegeTotalCount(Integer privilegeTotalCount) {
                        this.privilegeTotalCount = privilegeTotalCount;
                    }

                    public Integer getPrivilegeUnlockCount() {
                        return privilegeUnlockCount;
                    }

                    public void setPrivilegeUnlockCount(Integer privilegeUnlockCount) {
                        this.privilegeUnlockCount = privilegeUnlockCount;
                    }

                    public Double getRate() {
                        return rate;
                    }

                    public void setRate(Double rate) {
                        this.rate = rate;
                    }

                    public Integer getScore() {
                        return score;
                    }

                    public void setScore(Integer score) {
                        this.score = score;
                    }

                    public Object getStageMatch() {
                        return stageMatch;
                    }

                    public void setStageMatch(Object stageMatch) {
                        this.stageMatch = stageMatch;
                    }

                    public Integer getUid() {
                        return uid;
                    }

                    public void setUid(Integer uid) {
                        this.uid = uid;
                    }
                }

                public static class VipInfo {
                    /**
                     * copywriting : 映客VIP重磅上线 多种权益低价享
                     * end_date : 1970-01-01
                     * end_time : 1970-01-01T08:00:00+08:00
                     * is_display : true
                     * is_vip : false
                     * public_chat_vip_icon :
                     * vip_icon : https://img.ikstatic.cn/MTYwNTI0OTczNzI5MCM2MjgjcG5n.png
                     * vip_tab : https://boc.inke.cn/react/innerapp-2020/vip/entry/index.html?from=me&isWebFullScreen=true&isBatteryWhite=true&isShowCustomNavBar=true
                     */

                    @SerializedName("copywriting")
                    private String copywriting;
                    @SerializedName("end_date")
                    private String endDate;
                    @SerializedName("end_time")
                    private String endTime;
                    @SerializedName("is_display")
                    private Boolean isDisplay;
                    @SerializedName("is_vip")
                    private Boolean isVip;
                    @SerializedName("public_chat_vip_icon")
                    private String publicChatVipIcon;
                    @SerializedName("vip_icon")
                    private String vipIcon;
                    @SerializedName("vip_tab")
                    private String vipTab;

                    public String getCopywriting() {
                        return copywriting;
                    }

                    public void setCopywriting(String copywriting) {
                        this.copywriting = copywriting;
                    }

                    public String getEndDate() {
                        return endDate;
                    }

                    public void setEndDate(String endDate) {
                        this.endDate = endDate;
                    }

                    public String getEndTime() {
                        return endTime;
                    }

                    public void setEndTime(String endTime) {
                        this.endTime = endTime;
                    }

                    public Boolean isIsDisplay() {
                        return isDisplay;
                    }

                    public void setIsDisplay(Boolean isDisplay) {
                        this.isDisplay = isDisplay;
                    }

                    public Boolean isIsVip() {
                        return isVip;
                    }

                    public void setIsVip(Boolean isVip) {
                        this.isVip = isVip;
                    }

                    public String getPublicChatVipIcon() {
                        return publicChatVipIcon;
                    }

                    public void setPublicChatVipIcon(String publicChatVipIcon) {
                        this.publicChatVipIcon = publicChatVipIcon;
                    }

                    public String getVipIcon() {
                        return vipIcon;
                    }

                    public void setVipIcon(String vipIcon) {
                        this.vipIcon = vipIcon;
                    }

                    public String getVipTab() {
                        return vipTab;
                    }

                    public void setVipTab(String vipTab) {
                        this.vipTab = vipTab;
                    }
                }

                public static class WechatInfo {
                    /**
                     * stat : 0
                     */

                    @SerializedName("stat")
                    private Integer stat;

                    public Integer getStat() {
                        return stat;
                    }

                    public void setStat(Integer stat) {
                        this.stat = stat;
                    }
                }

                public static class VerifyList {
                    /**
                     * expire_at : 32503651199
                     * expire_at_str :
                     * id : 273
                     * is_selected : true
                     * reason : 舞蹈频道 闪亮红人
                     * type : channel
                     * verified_prefix :
                     */

                    @SerializedName("expire_at")
                    private Long expireAt;
                    @SerializedName("expire_at_str")
                    private String expireAtStr;
                    @SerializedName("id")
                    private Integer id;
                    @SerializedName("is_selected")
                    private Boolean isSelected;
                    @SerializedName("reason")
                    private String reason;
                    @SerializedName("type")
                    private String type;
                    @SerializedName("verified_prefix")
                    private String verifiedPrefix;

                    public Long getExpireAt() {
                        return expireAt;
                    }

                    public void setExpireAt(Long expireAt) {
                        this.expireAt = expireAt;
                    }

                    public String getExpireAtStr() {
                        return expireAtStr;
                    }

                    public void setExpireAtStr(String expireAtStr) {
                        this.expireAtStr = expireAtStr;
                    }

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public Boolean isIsSelected() {
                        return isSelected;
                    }

                    public void setIsSelected(Boolean isSelected) {
                        this.isSelected = isSelected;
                    }

                    public String getReason() {
                        return reason;
                    }

                    public void setReason(String reason) {
                        this.reason = reason;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getVerifiedPrefix() {
                        return verifiedPrefix;
                    }

                    public void setVerifiedPrefix(String verifiedPrefix) {
                        this.verifiedPrefix = verifiedPrefix;
                    }
                }
            }

            public static class Extra {
                /**
                 * cover : null
                 * label : []
                 */

                @SerializedName("cover")
                private Object cover;
                @SerializedName("label")
                private List<?> label;

                public Object getCover() {
                    return cover;
                }

                public void setCover(Object cover) {
                    this.cover = cover;
                }

                public List<?> getLabel() {
                    return label;
                }

                public void setLabel(List<?> label) {
                    this.label = label;
                }
            }

            public static class LabelTags {
                /**
                 * posa : null
                 * posb : {"text":""}
                 * posc : {"text":"跳舞啦～"}
                 * posd : {"end_color":"#AD000000","frame":"#00000000","icon":"http://img.ikstatic.cn/MTU2NzUxODg5NzU0MyM5MzYjcG5n.png","start_color":"#AD000000"}
                 * posh : null
                 * posi : null
                 * pose : null
                 * posg : null
                 * posj : null
                 */

                @SerializedName("posa")
                private Object posa;
                @SerializedName("posb")
                private Posb posb;
                @SerializedName("posc")
                private Posc posc;
                @SerializedName("posd")
                private Posd posd;
                @SerializedName("posh")
                private Object posh;
                @SerializedName("posi")
                private Object posi;
                @SerializedName("pose")
                private Object pose;
                @SerializedName("posg")
                private Object posg;
                @SerializedName("posj")
                private Object posj;

                public Object getPosa() {
                    return posa;
                }

                public void setPosa(Object posa) {
                    this.posa = posa;
                }

                public Posb getPosb() {
                    return posb;
                }

                public void setPosb(Posb posb) {
                    this.posb = posb;
                }

                public Posc getPosc() {
                    return posc;
                }

                public void setPosc(Posc posc) {
                    this.posc = posc;
                }

                public Posd getPosd() {
                    return posd;
                }

                public void setPosd(Posd posd) {
                    this.posd = posd;
                }

                public Object getPosh() {
                    return posh;
                }

                public void setPosh(Object posh) {
                    this.posh = posh;
                }

                public Object getPosi() {
                    return posi;
                }

                public void setPosi(Object posi) {
                    this.posi = posi;
                }

                public Object getPose() {
                    return pose;
                }

                public void setPose(Object pose) {
                    this.pose = pose;
                }

                public Object getPosg() {
                    return posg;
                }

                public void setPosg(Object posg) {
                    this.posg = posg;
                }

                public Object getPosj() {
                    return posj;
                }

                public void setPosj(Object posj) {
                    this.posj = posj;
                }

                public static class Posb {
                    /**
                     * text :
                     */

                    @SerializedName("text")
                    private String text;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }
                }

                public static class Posc {
                    /**
                     * text : 跳舞啦～
                     */

                    @SerializedName("text")
                    private String text;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }
                }

                public static class Posd {
                    /**
                     * end_color : #AD000000
                     * frame : #00000000
                     * icon : http://img.ikstatic.cn/MTU2NzUxODg5NzU0MyM5MzYjcG5n.png
                     * start_color : #AD000000
                     */

                    @SerializedName("end_color")
                    private String endColor;
                    @SerializedName("frame")
                    private String frame;
                    @SerializedName("icon")
                    private String icon;
                    @SerializedName("start_color")
                    private String startColor;

                    public String getEndColor() {
                        return endColor;
                    }

                    public void setEndColor(String endColor) {
                        this.endColor = endColor;
                    }

                    public String getFrame() {
                        return frame;
                    }

                    public void setFrame(String frame) {
                        this.frame = frame;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getStartColor() {
                        return startColor;
                    }

                    public void setStartColor(String startColor) {
                        this.startColor = startColor;
                    }
                }
            }

            public static class Numbers {
                /**
                 * liveid : 1606973619032885
                 * real : 323
                 */

                @SerializedName("liveid")
                private String liveid;
                @SerializedName("real")
                private Integer real;

                public String getLiveid() {
                    return liveid;
                }

                public void setLiveid(String liveid) {
                    this.liveid = liveid;
                }

                public Integer getReal() {
                    return real;
                }

                public void setReal(Integer real) {
                    this.real = real;
                }
            }

            public static class Room {
                /**
                 * annoncement :
                 * cover :
                 * cover_check :
                 * cover_status : 0
                 * id : 0
                 * liveid :
                 * name :
                 * owner : 0
                 * playid : 0
                 * show_room_id : 0
                 * show_room_resource :
                 * status : 0
                 * title :
                 */

                @SerializedName("annoncement")
                private String annoncement;
                @SerializedName("cover")
                private String cover;
                @SerializedName("cover_check")
                private String coverCheck;
                @SerializedName("cover_status")
                private Integer coverStatus;
                @SerializedName("id")
                private Integer id;
                @SerializedName("liveid")
                private String liveid;
                @SerializedName("name")
                private String name;
                @SerializedName("owner")
                private Integer owner;
                @SerializedName("playid")
                private Integer playid;
                @SerializedName("show_room_id")
                private Integer showRoomId;
                @SerializedName("show_room_resource")
                private String showRoomResource;
                @SerializedName("status")
                private Integer status;
                @SerializedName("title")
                private String title;

                public String getAnnoncement() {
                    return annoncement;
                }

                public void setAnnoncement(String annoncement) {
                    this.annoncement = annoncement;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getCoverCheck() {
                    return coverCheck;
                }

                public void setCoverCheck(String coverCheck) {
                    this.coverCheck = coverCheck;
                }

                public Integer getCoverStatus() {
                    return coverStatus;
                }

                public void setCoverStatus(Integer coverStatus) {
                    this.coverStatus = coverStatus;
                }

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getLiveid() {
                    return liveid;
                }

                public void setLiveid(String liveid) {
                    this.liveid = liveid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Integer getOwner() {
                    return owner;
                }

                public void setOwner(Integer owner) {
                    this.owner = owner;
                }

                public Integer getPlayid() {
                    return playid;
                }

                public void setPlayid(Integer playid) {
                    this.playid = playid;
                }

                public Integer getShowRoomId() {
                    return showRoomId;
                }

                public void setShowRoomId(Integer showRoomId) {
                    this.showRoomId = showRoomId;
                }

                public String getShowRoomResource() {
                    return showRoomResource;
                }

                public void setShowRoomResource(String showRoomResource) {
                    this.showRoomResource = showRoomResource;
                }

                public Integer getStatus() {
                    return status;
                }

                public void setStatus(Integer status) {
                    this.status = status;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }

            public static class ExtraStreamAddrs {
                /**
                 * id : 1606973619032885
                 * link : 0
                 * multi : 0
                 * quality : 1
                 * sharpness : 高清
                 * stream_addr : http://bssource.rtc.inke.cn/live/1606973619032885.flv?auth_version=1&codecInfo=8192&dpSrc=6&from=hallfe&ikChorus=1&ikDnsOp=1&ikFastRate=1.1&ikHost=bsy&ikLiveType=normal&ikLog=1&ikMaxBuf=3600&ikMinBuf=2900&ikNetOp=01111&ikOp=0&ikSlowRate=0.9&ikSyncBeta=1&md5sum=7704&msUid=313054160&pushHost=clsTrans.push.cls.inke.cn&timestamp=1606974352
                 */

                @SerializedName("id")
                private String id;
                @SerializedName("link")
                private Integer link;
                @SerializedName("multi")
                private Integer multi;
                @SerializedName("quality")
                private Integer quality;
                @SerializedName("sharpness")
                private String sharpness;
                @SerializedName("stream_addr")
                private String streamAddr;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public Integer getLink() {
                    return link;
                }

                public void setLink(Integer link) {
                    this.link = link;
                }

                public Integer getMulti() {
                    return multi;
                }

                public void setMulti(Integer multi) {
                    this.multi = multi;
                }

                public Integer getQuality() {
                    return quality;
                }

                public void setQuality(Integer quality) {
                    this.quality = quality;
                }

                public String getSharpness() {
                    return sharpness;
                }

                public void setSharpness(String sharpness) {
                    this.sharpness = sharpness;
                }

                public String getStreamAddr() {
                    return streamAddr;
                }

                public void setStreamAddr(String streamAddr) {
                    this.streamAddr = streamAddr;
                }
            }
        }
    }
}
