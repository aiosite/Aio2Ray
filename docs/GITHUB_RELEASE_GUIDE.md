# Aio2Ray - انتشار در گیت‌هاب و ساخت APK

در این راهنما نحوه آپلود کدهای **Aio2Ray** در گیت‌هاب و تولید خودکار نسخه **APK** از طریق **GitHub Actions** توضیح داده شده است.

## ۱. ایجاد مخزن گیت‌هاب
۱. وارد [GitHub](https://github.com) شوید.
۲. مخزنی جدید با نام `Aio2Ray` بسازید (عمومی یا خصوصی).
۳. کدها را از فضای کاری (Workspace) کپی کرده و در مخزن آپلود کنید.

## ۲. ساختار پوشه‌ها در گیت‌هاب
مطمئن شوید پوشه‌ها به صورت زیر باشند:
```
Aio2Ray/
├── .github/
│   └── workflows/
│       └── build.yml
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/aio2ray/mobile/
│   │       ├── res/
│   │       └── AndroidManifest.xml
│   └── build.gradle
├── V2rayNG/ (کدهای منبع v2rayNG)
├── build.gradle
├── settings.gradle
├── README.md
├── compile-hevtun.sh
└── docs/
```

## ۳. فعال‌سازی ساخت APK (GitHub Actions)
۱. در گیت‌هاب، به بخش **Actions** بروید.
۲. با اولین پش (Push) یا ایجاد **Release**، پروسه `Build Aio2Ray APK` شروع می‌شود.
۳. پروسه:
   - کدها را چک‌اوت می‌کند.
   - JDK 21 و Android SDK را تنظیم می‌کند.
   - دستور `./gradlew assemblePlaystoreDebug` را اجرا می‌کند.
   - فایل‌های APK (arm64 و armv7) را به عنوان **Artifact** آپلود می‌کند.

## ۴. دانلود نسخه APK
۱. به بخش **Releases** بروید.
۲. فایل‌های APK را دانلود کنید.
۳. نصب کنید (اجازه نصب از منابع ناشناخته را فعال کنید).

## ۵. زبان‌ها و ویژگی‌ها
- **فارسی (FA):** راست‌چین (RTL)
- **انگلیسی (EN):** چپ‌چین (LTR)
- **پروتکل‌ها:** Vmess, Vless, Shadowsocks, Trojan, Hysteria
- **لوگو:** Aio2Ray (طراحی شده)

## ۶. مجوز
GPL-3.0

---
**توضیح:** این راهنما بر اساس کدهای `v2rayNG` و `v2box` نوشته شده است. برای تغییر پکیج به `com.aio2ray.mobile`، فایل‌های `build.gradle` و `AndroidManifest.xml` را ویرایش کنید (که در فضای کاری انجام شده است).
