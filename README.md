# Mobile App Project Skeleton
> Mobile app project skeleton

![android](https://img.shields.io/badge/android-java-brightgreen.svg)

### android-java project uses:
- Redux with [Reductor](https://github.com/Yarikx/reductor), [RxAndroid](https://github.com/ReactiveX/RxAndroid),  [RxJava](https://github.com/ReactiveX/RxJava)
- Navigation with [Conductor](https://github.com/bluelinelabs/Conductor)
- [Fresco](https://github.com/facebook/fresco)
- [Flexbox](https://github.com/google/flexbox-layout)
 
### Project Setup
1. Clone skeleton repo into a **temperory** directory
```
git clone https://github.com/oursky/skeleton skeleton
```
2. Init your repo
```
mkdir new-project
cd new-project
git init
cp ../skeleton/.gitignore .
vi LICENSE
vi README.md
git add .gitignore LICENSE README.md
git commit -am "init repo"
```
3. copy modules into new project, e.g. `android-java`
```
cp -R skeleton/android-java new-project/
```
4. Adjust code
   - App Name
   - Manifest(Android) or Info.plist(iOS)
   - Build Configuration (gradle, or xcode project)
   - Rename package (`com.oursky.skeleton` to something else).  [How-To](https://stackoverflow.com/questions/16804093/android-studio-rename-package)
5. Add the modules and review changes
```
git add android-java
git status
git commit -am "pull in skeleton"
```
6. Push your new project 
```
git remote add oursky https://github.com/oursky/new-project
git push -u oursky master
```

### What's Next
- Setup [Crashlytics](https://fabric.io/kits/android/crashlytics) or [Sentry](https://sentry.io/welcome/)
- Setup [Buddybuild](https://www.buddybuild.com/)
- Setup [HockeyApp](https://www.hockeyapp.net/)

### License
Distributed under the MIT license. See ``LICENSE`` for more information.
