package com.genesoft.easyweather.model;


import java.util.List;

public class WeatherBean {
    /**
     * code : 10000
     * charge : false
     * msg : 查询成功
     * result : {"HeWeather5":[{"now":{"hum":"51","vis":"6","pres":"1016","pcpn":"0","fl":"9","tmp":"12","cond":{"txt":"多云","code":"101"},"wind":{"sc":"微风","spd":"10","deg":"238","dir":"西南风"}},"suggestion":{"uv":{"txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。","brf":"中等"},"cw":{"txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","brf":"较适宜"},"trav":{"txt":"天气较好，温度适宜，是个好天气哦。这样的天气适宜旅游，您可以尽情地享受大自然的风光。","brf":"适宜"},"air":{"txt":"气象条件较不利于空气污染物稀释、扩散和清除，请适当减少室外活动时间。","brf":"较差"},"comf":{"txt":"白天天气晴好，早晚会感觉偏凉，午后舒适、宜人。","brf":"较舒适"},"drsg":{"txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","brf":"较冷"},"sport":{"txt":"天气较好，无雨水困扰，较适宜进行各种运动，但因气温较低，在户外运动请注意增减衣物。","brf":"较适宜"},"flu":{"txt":"天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。","brf":"较易发"}},"aqi":{"city":{"no2":"91","o3":"7","pm25":"84","qlty":"轻度污染","so2":"8","aqi":"112","pm10":"140","co":"1"}},"basic":{"city":"北京","update":{"loc":"2017-10-31 17:46","utc":"2017-10-31 09:46"},"lon":"116.40528870","id":"CN101010100","cnty":"中国","lat":"39.90498734"},"daily_forecast":[{"date":"2017-10-31","pop":"15","hum":"24","uv":"3","vis":"16","astro":{"ss":"17:14","mr":"15:16","ms":"01:52","sr":"06:42"},"pres":"1021","pcpn":"0.0","tmp":{"min":"4","max":"16"},"cond":{"txt_n":"晴","code_n":"100","code_d":"101","txt_d":"多云"},"wind":{"sc":"微风","spd":"6","deg":"0","dir":"无持续风向"}},{"date":"2017-11-01","pop":"0","hum":"28","uv":"3","vis":"20","astro":{"ss":"17:13","mr":"15:49","ms":"02:56","sr":"06:43"},"pres":"1021","pcpn":"0.0","tmp":{"min":"5","max":"17"},"cond":{"txt_n":"阴","code_n":"104","code_d":"100","txt_d":"晴"},"wind":{"sc":"微风","spd":"6","deg":"48","dir":"东北风"}},{"date":"2017-11-02","pop":"23","hum":"29","uv":"2","vis":"20","astro":{"ss":"17:12","mr":"16:22","ms":"04:02","sr":"06:44"},"pres":"1020","pcpn":"0.0","tmp":{"min":"3","max":"16"},"cond":{"txt_n":"晴","code_n":"100","code_d":"104","txt_d":"阴"},"wind":{"sc":"微风","spd":"13","deg":"350","dir":"北风"}},{"date":"2017-11-03","pop":"0","hum":"20","uv":"2","vis":"20","astro":{"ss":"17:11","mr":"16:57","ms":"05:10","sr":"06:45"},"pres":"1032","pcpn":"0.0","tmp":{"min":"2","max":"14"},"cond":{"txt_n":"晴","code_n":"100","code_d":"100","txt_d":"晴"},"wind":{"sc":"微风","spd":"14","deg":"331","dir":"西北风"}},{"date":"2017-11-04","pop":"0","hum":"28","uv":"3","vis":"20","astro":{"ss":"17:10","mr":"17:36","ms":"06:20","sr":"06:46"},"pres":"1028","pcpn":"0.0","tmp":{"min":"4","max":"16"},"cond":{"txt_n":"晴","code_n":"100","code_d":"100","txt_d":"晴"},"wind":{"sc":"微风","spd":"5","deg":"207","dir":"西南风"}},{"date":"2017-11-05","pop":"2","hum":"34","uv":"3","vis":"20","astro":{"ss":"17:09","mr":"18:18","ms":"07:32","sr":"06:47"},"pres":"1024","pcpn":"0.0","tmp":{"min":"6","max":"16"},"cond":{"txt_n":"多云","code_n":"101","code_d":"101","txt_d":"多云"},"wind":{"sc":"微风","spd":"4","deg":"170","dir":"南风"}},{"date":"2017-11-06","pop":"6","hum":"40","uv":"4","vis":"20","astro":{"ss":"17:08","mr":"19:07","ms":"08:43","sr":"06:48"},"pres":"1020","pcpn":"0.0","tmp":{"min":"6","max":"16"},"cond":{"txt_n":"多云","code_n":"101","code_d":"101","txt_d":"多云"},"wind":{"sc":"微风","spd":"11","deg":"209","dir":"西南风"}}],"hourly_forecast":[{"date":"2017-10-31 19:00","pop":"0","hum":"74","pres":"1019","tmp":"9","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"5","deg":"192","dir":"西南风"}},{"date":"2017-10-31 22:00","pop":"0","hum":"88","pres":"1019","tmp":"8","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"3","deg":"74","dir":"东北风"}},{"date":"2017-11-01 01:00","pop":"0","hum":"87","pres":"1020","tmp":"5","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"5","deg":"3","dir":"北风"}},{"date":"2017-11-01 04:00","pop":"0","hum":"78","pres":"1022","tmp":"4","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"11","deg":"355","dir":"北风"}},{"date":"2017-11-01 07:00","pop":"0","hum":"76","pres":"1024","tmp":"4","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"8","deg":"121","dir":"东南风"}},{"date":"2017-11-01 10:00","pop":"0","hum":"44","pres":"1024","tmp":"7","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"10","deg":"121","dir":"东南风"}},{"date":"2017-11-01 13:00","pop":"0","hum":"29","pres":"1022","tmp":"15","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"6","deg":"26","dir":"东北风"}},{"date":"2017-11-01 16:00","pop":"0","hum":"38","pres":"1017","tmp":"16","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"6","deg":"175","dir":"南风"}}],"status":"ok"}]}
     */

    private String code;
    private boolean charge;
    private String msg;
    private ResultBean result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isCharge() {
        return charge;
    }

    public void setCharge(boolean charge) {
        this.charge = charge;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<HeWeather5Bean> HeWeather5;

        public List<HeWeather5Bean> getHeWeather5() {
            return HeWeather5;
        }

        public void setHeWeather5(List<HeWeather5Bean> HeWeather5) {
            this.HeWeather5 = HeWeather5;
        }

        public static class HeWeather5Bean {
            /**
             * now : {"hum":"51","vis":"6","pres":"1016","pcpn":"0","fl":"9","tmp":"12","cond":{"txt":"多云","code":"101"},"wind":{"sc":"微风","spd":"10","deg":"238","dir":"西南风"}}
             * suggestion : {"uv":{"txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。","brf":"中等"},"cw":{"txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","brf":"较适宜"},"trav":{"txt":"天气较好，温度适宜，是个好天气哦。这样的天气适宜旅游，您可以尽情地享受大自然的风光。","brf":"适宜"},"air":{"txt":"气象条件较不利于空气污染物稀释、扩散和清除，请适当减少室外活动时间。","brf":"较差"},"comf":{"txt":"白天天气晴好，早晚会感觉偏凉，午后舒适、宜人。","brf":"较舒适"},"drsg":{"txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","brf":"较冷"},"sport":{"txt":"天气较好，无雨水困扰，较适宜进行各种运动，但因气温较低，在户外运动请注意增减衣物。","brf":"较适宜"},"flu":{"txt":"天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。","brf":"较易发"}}
             * aqi : {"city":{"no2":"91","o3":"7","pm25":"84","qlty":"轻度污染","so2":"8","aqi":"112","pm10":"140","co":"1"}}
             * basic : {"city":"北京","update":{"loc":"2017-10-31 17:46","utc":"2017-10-31 09:46"},"lon":"116.40528870","id":"CN101010100","cnty":"中国","lat":"39.90498734"}
             * daily_forecast : [{"date":"2017-10-31","pop":"15","hum":"24","uv":"3","vis":"16","astro":{"ss":"17:14","mr":"15:16","ms":"01:52","sr":"06:42"},"pres":"1021","pcpn":"0.0","tmp":{"min":"4","max":"16"},"cond":{"txt_n":"晴","code_n":"100","code_d":"101","txt_d":"多云"},"wind":{"sc":"微风","spd":"6","deg":"0","dir":"无持续风向"}},{"date":"2017-11-01","pop":"0","hum":"28","uv":"3","vis":"20","astro":{"ss":"17:13","mr":"15:49","ms":"02:56","sr":"06:43"},"pres":"1021","pcpn":"0.0","tmp":{"min":"5","max":"17"},"cond":{"txt_n":"阴","code_n":"104","code_d":"100","txt_d":"晴"},"wind":{"sc":"微风","spd":"6","deg":"48","dir":"东北风"}},{"date":"2017-11-02","pop":"23","hum":"29","uv":"2","vis":"20","astro":{"ss":"17:12","mr":"16:22","ms":"04:02","sr":"06:44"},"pres":"1020","pcpn":"0.0","tmp":{"min":"3","max":"16"},"cond":{"txt_n":"晴","code_n":"100","code_d":"104","txt_d":"阴"},"wind":{"sc":"微风","spd":"13","deg":"350","dir":"北风"}},{"date":"2017-11-03","pop":"0","hum":"20","uv":"2","vis":"20","astro":{"ss":"17:11","mr":"16:57","ms":"05:10","sr":"06:45"},"pres":"1032","pcpn":"0.0","tmp":{"min":"2","max":"14"},"cond":{"txt_n":"晴","code_n":"100","code_d":"100","txt_d":"晴"},"wind":{"sc":"微风","spd":"14","deg":"331","dir":"西北风"}},{"date":"2017-11-04","pop":"0","hum":"28","uv":"3","vis":"20","astro":{"ss":"17:10","mr":"17:36","ms":"06:20","sr":"06:46"},"pres":"1028","pcpn":"0.0","tmp":{"min":"4","max":"16"},"cond":{"txt_n":"晴","code_n":"100","code_d":"100","txt_d":"晴"},"wind":{"sc":"微风","spd":"5","deg":"207","dir":"西南风"}},{"date":"2017-11-05","pop":"2","hum":"34","uv":"3","vis":"20","astro":{"ss":"17:09","mr":"18:18","ms":"07:32","sr":"06:47"},"pres":"1024","pcpn":"0.0","tmp":{"min":"6","max":"16"},"cond":{"txt_n":"多云","code_n":"101","code_d":"101","txt_d":"多云"},"wind":{"sc":"微风","spd":"4","deg":"170","dir":"南风"}},{"date":"2017-11-06","pop":"6","hum":"40","uv":"4","vis":"20","astro":{"ss":"17:08","mr":"19:07","ms":"08:43","sr":"06:48"},"pres":"1020","pcpn":"0.0","tmp":{"min":"6","max":"16"},"cond":{"txt_n":"多云","code_n":"101","code_d":"101","txt_d":"多云"},"wind":{"sc":"微风","spd":"11","deg":"209","dir":"西南风"}}]
             * hourly_forecast : [{"date":"2017-10-31 19:00","pop":"0","hum":"74","pres":"1019","tmp":"9","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"5","deg":"192","dir":"西南风"}},{"date":"2017-10-31 22:00","pop":"0","hum":"88","pres":"1019","tmp":"8","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"3","deg":"74","dir":"东北风"}},{"date":"2017-11-01 01:00","pop":"0","hum":"87","pres":"1020","tmp":"5","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"5","deg":"3","dir":"北风"}},{"date":"2017-11-01 04:00","pop":"0","hum":"78","pres":"1022","tmp":"4","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"11","deg":"355","dir":"北风"}},{"date":"2017-11-01 07:00","pop":"0","hum":"76","pres":"1024","tmp":"4","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"8","deg":"121","dir":"东南风"}},{"date":"2017-11-01 10:00","pop":"0","hum":"44","pres":"1024","tmp":"7","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"10","deg":"121","dir":"东南风"}},{"date":"2017-11-01 13:00","pop":"0","hum":"29","pres":"1022","tmp":"15","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"6","deg":"26","dir":"东北风"}},{"date":"2017-11-01 16:00","pop":"0","hum":"38","pres":"1017","tmp":"16","cond":{"txt":"晴","code":"100"},"wind":{"sc":"微风","spd":"6","deg":"175","dir":"南风"}}]
             * status : ok
             */

            private NowBean now;
            private SuggestionBean suggestion;
            private AqiBean aqi;
            private BasicBean basic;
            private String status;
            private List<DailyForecastBean> daily_forecast;
            private List<HourlyForecastBean> hourly_forecast;

            public NowBean getNow() {
                return now;
            }

            public void setNow(NowBean now) {
                this.now = now;
            }

            public SuggestionBean getSuggestion() {
                return suggestion;
            }

            public void setSuggestion(SuggestionBean suggestion) {
                this.suggestion = suggestion;
            }

            public AqiBean getAqi() {
                return aqi;
            }

            public void setAqi(AqiBean aqi) {
                this.aqi = aqi;
            }

            public BasicBean getBasic() {
                return basic;
            }

            public void setBasic(BasicBean basic) {
                this.basic = basic;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public List<DailyForecastBean> getDaily_forecast() {
                return daily_forecast;
            }

            public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
                this.daily_forecast = daily_forecast;
            }

            public List<HourlyForecastBean> getHourly_forecast() {
                return hourly_forecast;
            }

            public void setHourly_forecast(List<HourlyForecastBean> hourly_forecast) {
                this.hourly_forecast = hourly_forecast;
            }

            public static class NowBean {
                /**
                 * hum : 51
                 * vis : 6
                 * pres : 1016
                 * pcpn : 0
                 * fl : 9
                 * tmp : 12
                 * cond : {"txt":"多云","code":"101"}
                 * wind : {"sc":"微风","spd":"10","deg":"238","dir":"西南风"}
                 */

                private String hum;
                private String vis;
                private String pres;
                private String pcpn;
                private String fl;
                private String tmp;
                private CondBean cond;
                private WindBean wind;

                public String getHum() {
                    return hum;
                }

                public void setHum(String hum) {
                    this.hum = hum;
                }

                public String getVis() {
                    return vis;
                }

                public void setVis(String vis) {
                    this.vis = vis;
                }

                public String getPres() {
                    return pres;
                }

                public void setPres(String pres) {
                    this.pres = pres;
                }

                public String getPcpn() {
                    return pcpn;
                }

                public void setPcpn(String pcpn) {
                    this.pcpn = pcpn;
                }

                public String getFl() {
                    return fl;
                }

                public void setFl(String fl) {
                    this.fl = fl;
                }

                public String getTmp() {
                    return tmp;
                }

                public void setTmp(String tmp) {
                    this.tmp = tmp;
                }

                public CondBean getCond() {
                    return cond;
                }

                public void setCond(CondBean cond) {
                    this.cond = cond;
                }

                public WindBean getWind() {
                    return wind;
                }

                public void setWind(WindBean wind) {
                    this.wind = wind;
                }

                public static class CondBean {
                    /**
                     * txt : 多云
                     * code : 101
                     */

                    private String txt;
                    private String code;

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }
                }

                public static class WindBean {
                    /**
                     * sc : 微风
                     * spd : 10
                     * deg : 238
                     * dir : 西南风
                     */

                    private String sc;
                    private String spd;
                    private String deg;
                    private String dir;

                    public String getSc() {
                        return sc;
                    }

                    public void setSc(String sc) {
                        this.sc = sc;
                    }

                    public String getSpd() {
                        return spd;
                    }

                    public void setSpd(String spd) {
                        this.spd = spd;
                    }

                    public String getDeg() {
                        return deg;
                    }

                    public void setDeg(String deg) {
                        this.deg = deg;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public void setDir(String dir) {
                        this.dir = dir;
                    }
                }
            }

            public static class SuggestionBean {
                /**
                 * uv : {"txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。","brf":"中等"}
                 * cw : {"txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","brf":"较适宜"}
                 * trav : {"txt":"天气较好，温度适宜，是个好天气哦。这样的天气适宜旅游，您可以尽情地享受大自然的风光。","brf":"适宜"}
                 * air : {"txt":"气象条件较不利于空气污染物稀释、扩散和清除，请适当减少室外活动时间。","brf":"较差"}
                 * comf : {"txt":"白天天气晴好，早晚会感觉偏凉，午后舒适、宜人。","brf":"较舒适"}
                 * drsg : {"txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","brf":"较冷"}
                 * sport : {"txt":"天气较好，无雨水困扰，较适宜进行各种运动，但因气温较低，在户外运动请注意增减衣物。","brf":"较适宜"}
                 * flu : {"txt":"天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。","brf":"较易发"}
                 */

                private UvBean uv;
                private CwBean cw;
                private TravBean trav;
                private AirBean air;
                private ComfBean comf;
                private DrsgBean drsg;
                private SportBean sport;
                private FluBean flu;

                public UvBean getUv() {
                    return uv;
                }

                public void setUv(UvBean uv) {
                    this.uv = uv;
                }

                public CwBean getCw() {
                    return cw;
                }

                public void setCw(CwBean cw) {
                    this.cw = cw;
                }

                public TravBean getTrav() {
                    return trav;
                }

                public void setTrav(TravBean trav) {
                    this.trav = trav;
                }

                public AirBean getAir() {
                    return air;
                }

                public void setAir(AirBean air) {
                    this.air = air;
                }

                public ComfBean getComf() {
                    return comf;
                }

                public void setComf(ComfBean comf) {
                    this.comf = comf;
                }

                public DrsgBean getDrsg() {
                    return drsg;
                }

                public void setDrsg(DrsgBean drsg) {
                    this.drsg = drsg;
                }

                public SportBean getSport() {
                    return sport;
                }

                public void setSport(SportBean sport) {
                    this.sport = sport;
                }

                public FluBean getFlu() {
                    return flu;
                }

                public void setFlu(FluBean flu) {
                    this.flu = flu;
                }

                public static class UvBean {
                    /**
                     * txt : 属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。
                     * brf : 中等
                     */

                    private String txt;
                    private String brf;

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }
                }

                public static class CwBean {
                    /**
                     * txt : 较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。
                     * brf : 较适宜
                     */

                    private String txt;
                    private String brf;

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }
                }

                public static class TravBean {
                    /**
                     * txt : 天气较好，温度适宜，是个好天气哦。这样的天气适宜旅游，您可以尽情地享受大自然的风光。
                     * brf : 适宜
                     */

                    private String txt;
                    private String brf;

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }
                }

                public static class AirBean {
                    /**
                     * txt : 气象条件较不利于空气污染物稀释、扩散和清除，请适当减少室外活动时间。
                     * brf : 较差
                     */

                    private String txt;
                    private String brf;

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }
                }

                public static class ComfBean {
                    /**
                     * txt : 白天天气晴好，早晚会感觉偏凉，午后舒适、宜人。
                     * brf : 较舒适
                     */

                    private String txt;
                    private String brf;

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }
                }

                public static class DrsgBean {
                    /**
                     * txt : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
                     * brf : 较冷
                     */

                    private String txt;
                    private String brf;

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }
                }

                public static class SportBean {
                    /**
                     * txt : 天气较好，无雨水困扰，较适宜进行各种运动，但因气温较低，在户外运动请注意增减衣物。
                     * brf : 较适宜
                     */

                    private String txt;
                    private String brf;

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }
                }

                public static class FluBean {
                    /**
                     * txt : 天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。
                     * brf : 较易发
                     */

                    private String txt;
                    private String brf;

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }

                    public String getBrf() {
                        return brf;
                    }

                    public void setBrf(String brf) {
                        this.brf = brf;
                    }
                }
            }

            public static class AqiBean {
                /**
                 * city : {"no2":"91","o3":"7","pm25":"84","qlty":"轻度污染","so2":"8","aqi":"112","pm10":"140","co":"1"}
                 */

                private CityBean city;

                public CityBean getCity() {
                    return city;
                }

                public void setCity(CityBean city) {
                    this.city = city;
                }

                public static class CityBean {
                    /**
                     * no2 : 91
                     * o3 : 7
                     * pm25 : 84
                     * qlty : 轻度污染
                     * so2 : 8
                     * aqi : 112
                     * pm10 : 140
                     * co : 1
                     */

                    private String no2;
                    private String o3;
                    private String pm25;
                    private String qlty;
                    private String so2;
                    private String aqi;
                    private String pm10;
                    private String co;

                    public String getNo2() {
                        return no2;
                    }

                    public void setNo2(String no2) {
                        this.no2 = no2;
                    }

                    public String getO3() {
                        return o3;
                    }

                    public void setO3(String o3) {
                        this.o3 = o3;
                    }

                    public String getPm25() {
                        return pm25;
                    }

                    public void setPm25(String pm25) {
                        this.pm25 = pm25;
                    }

                    public String getQlty() {
                        return qlty;
                    }

                    public void setQlty(String qlty) {
                        this.qlty = qlty;
                    }

                    public String getSo2() {
                        return so2;
                    }

                    public void setSo2(String so2) {
                        this.so2 = so2;
                    }

                    public String getAqi() {
                        return aqi;
                    }

                    public void setAqi(String aqi) {
                        this.aqi = aqi;
                    }

                    public String getPm10() {
                        return pm10;
                    }

                    public void setPm10(String pm10) {
                        this.pm10 = pm10;
                    }

                    public String getCo() {
                        return co;
                    }

                    public void setCo(String co) {
                        this.co = co;
                    }
                }
            }

            public static class BasicBean {
                /**
                 * city : 北京
                 * update : {"loc":"2017-10-31 17:46","utc":"2017-10-31 09:46"}
                 * lon : 116.40528870
                 * id : CN101010100
                 * cnty : 中国
                 * lat : 39.90498734
                 */

                private String city;
                private UpdateBean update;
                private String lon;
                private String id;
                private String cnty;
                private String lat;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public UpdateBean getUpdate() {
                    return update;
                }

                public void setUpdate(UpdateBean update) {
                    this.update = update;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getCnty() {
                    return cnty;
                }

                public void setCnty(String cnty) {
                    this.cnty = cnty;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public static class UpdateBean {
                    /**
                     * loc : 2017-10-31 17:46
                     * utc : 2017-10-31 09:46
                     */

                    private String loc;
                    private String utc;

                    public String getLoc() {
                        return loc;
                    }

                    public void setLoc(String loc) {
                        this.loc = loc;
                    }

                    public String getUtc() {
                        return utc;
                    }

                    public void setUtc(String utc) {
                        this.utc = utc;
                    }
                }
            }

            public static class DailyForecastBean {
                /**
                 * date : 2017-10-31
                 * pop : 15
                 * hum : 24
                 * uv : 3
                 * vis : 16
                 * astro : {"ss":"17:14","mr":"15:16","ms":"01:52","sr":"06:42"}
                 * pres : 1021
                 * pcpn : 0.0
                 * tmp : {"min":"4","max":"16"}
                 * cond : {"txt_n":"晴","code_n":"100","code_d":"101","txt_d":"多云"}
                 * wind : {"sc":"微风","spd":"6","deg":"0","dir":"无持续风向"}
                 */

                private String date;
                private String pop;
                private String hum;
                private String uv;
                private String vis;
                private AstroBean astro;
                private String pres;
                private String pcpn;
                private TmpBean tmp;
                private CondBeanX cond;
                private WindBeanX wind;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getPop() {
                    return pop;
                }

                public void setPop(String pop) {
                    this.pop = pop;
                }

                public String getHum() {
                    return hum;
                }

                public void setHum(String hum) {
                    this.hum = hum;
                }

                public String getUv() {
                    return uv;
                }

                public void setUv(String uv) {
                    this.uv = uv;
                }

                public String getVis() {
                    return vis;
                }

                public void setVis(String vis) {
                    this.vis = vis;
                }

                public AstroBean getAstro() {
                    return astro;
                }

                public void setAstro(AstroBean astro) {
                    this.astro = astro;
                }

                public String getPres() {
                    return pres;
                }

                public void setPres(String pres) {
                    this.pres = pres;
                }

                public String getPcpn() {
                    return pcpn;
                }

                public void setPcpn(String pcpn) {
                    this.pcpn = pcpn;
                }

                public TmpBean getTmp() {
                    return tmp;
                }

                public void setTmp(TmpBean tmp) {
                    this.tmp = tmp;
                }

                public CondBeanX getCond() {
                    return cond;
                }

                public void setCond(CondBeanX cond) {
                    this.cond = cond;
                }

                public WindBeanX getWind() {
                    return wind;
                }

                public void setWind(WindBeanX wind) {
                    this.wind = wind;
                }

                public static class AstroBean {
                    /**
                     * ss : 17:14
                     * mr : 15:16
                     * ms : 01:52
                     * sr : 06:42
                     */

                    private String ss;
                    private String mr;
                    private String ms;
                    private String sr;

                    public String getSs() {
                        return ss;
                    }

                    public void setSs(String ss) {
                        this.ss = ss;
                    }

                    public String getMr() {
                        return mr;
                    }

                    public void setMr(String mr) {
                        this.mr = mr;
                    }

                    public String getMs() {
                        return ms;
                    }

                    public void setMs(String ms) {
                        this.ms = ms;
                    }

                    public String getSr() {
                        return sr;
                    }

                    public void setSr(String sr) {
                        this.sr = sr;
                    }
                }

                public static class TmpBean {
                    /**
                     * min : 4
                     * max : 16
                     */

                    private String min;
                    private String max;

                    public String getMin() {
                        return min;
                    }

                    public void setMin(String min) {
                        this.min = min;
                    }

                    public String getMax() {
                        return max;
                    }

                    public void setMax(String max) {
                        this.max = max;
                    }
                }

                public static class CondBeanX {
                    /**
                     * txt_n : 晴
                     * code_n : 100
                     * code_d : 101
                     * txt_d : 多云
                     */

                    private String txt_n;
                    private String code_n;
                    private String code_d;
                    private String txt_d;

                    public String getTxt_n() {
                        return txt_n;
                    }

                    public void setTxt_n(String txt_n) {
                        this.txt_n = txt_n;
                    }

                    public String getCode_n() {
                        return code_n;
                    }

                    public void setCode_n(String code_n) {
                        this.code_n = code_n;
                    }

                    public String getCode_d() {
                        return code_d;
                    }

                    public void setCode_d(String code_d) {
                        this.code_d = code_d;
                    }

                    public String getTxt_d() {
                        return txt_d;
                    }

                    public void setTxt_d(String txt_d) {
                        this.txt_d = txt_d;
                    }
                }

                public static class WindBeanX {
                    /**
                     * sc : 微风
                     * spd : 6
                     * deg : 0
                     * dir : 无持续风向
                     */

                    private String sc;
                    private String spd;
                    private String deg;
                    private String dir;

                    public String getSc() {
                        return sc;
                    }

                    public void setSc(String sc) {
                        this.sc = sc;
                    }

                    public String getSpd() {
                        return spd;
                    }

                    public void setSpd(String spd) {
                        this.spd = spd;
                    }

                    public String getDeg() {
                        return deg;
                    }

                    public void setDeg(String deg) {
                        this.deg = deg;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public void setDir(String dir) {
                        this.dir = dir;
                    }
                }
            }

            public static class HourlyForecastBean {
                /**
                 * date : 2017-10-31 19:00
                 * pop : 0
                 * hum : 74
                 * pres : 1019
                 * tmp : 9
                 * cond : {"txt":"晴","code":"100"}
                 * wind : {"sc":"微风","spd":"5","deg":"192","dir":"西南风"}
                 */

                private String date;
                private String pop;
                private String hum;
                private String pres;
                private String tmp;
                private CondBeanXX cond;
                private WindBeanXX wind;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getPop() {
                    return pop;
                }

                public void setPop(String pop) {
                    this.pop = pop;
                }

                public String getHum() {
                    return hum;
                }

                public void setHum(String hum) {
                    this.hum = hum;
                }

                public String getPres() {
                    return pres;
                }

                public void setPres(String pres) {
                    this.pres = pres;
                }

                public String getTmp() {
                    return tmp;
                }

                public void setTmp(String tmp) {
                    this.tmp = tmp;
                }

                public CondBeanXX getCond() {
                    return cond;
                }

                public void setCond(CondBeanXX cond) {
                    this.cond = cond;
                }

                public WindBeanXX getWind() {
                    return wind;
                }

                public void setWind(WindBeanXX wind) {
                    this.wind = wind;
                }

                public static class CondBeanXX {
                    /**
                     * txt : 晴
                     * code : 100
                     */

                    private String txt;
                    private String code;

                    public String getTxt() {
                        return txt;
                    }

                    public void setTxt(String txt) {
                        this.txt = txt;
                    }

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }
                }

                public static class WindBeanXX {
                    /**
                     * sc : 微风
                     * spd : 5
                     * deg : 192
                     * dir : 西南风
                     */

                    private String sc;
                    private String spd;
                    private String deg;
                    private String dir;

                    public String getSc() {
                        return sc;
                    }

                    public void setSc(String sc) {
                        this.sc = sc;
                    }

                    public String getSpd() {
                        return spd;
                    }

                    public void setSpd(String spd) {
                        this.spd = spd;
                    }

                    public String getDeg() {
                        return deg;
                    }

                    public void setDeg(String deg) {
                        this.deg = deg;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public void setDir(String dir) {
                        this.dir = dir;
                    }
                }
            }
        }
    }
}
