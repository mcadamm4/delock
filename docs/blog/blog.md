# Delock Blog

## `Monday November 13, 2017`

I had my first meeting with my supervisor David Sinclair last week on Tuesday the 7th. Since then I have written a first draft of my Functional Specification, I have another meeting with David tomorrow in which we will review the draft.

---

## `Tuesday November 14, 2017`

I had my second meeting with David today, in the run up to this meeting I was working on the Functional Spec and created a number of detailed Use cases. This helped me immensely in that I now have a much clearer idea of how the system will function and what I will need to do to implement it.

At the moment, I feel the best stack for developing the DApp will be:

1. Web3j (Android client for communicating with the blockchain)
2. Truffle (testing smart contracts)
3. Infura (Will host a network of nodes that will act as my blockchain network)

### `Done`

- ~~Setup Infura test network~~

### `To-Do`

- Complete full draft of Functional Spec
- Download and learn how to use Web3j

---

## `Friday November 17, 2017`

I spent this week working on a draft of the Functional Specification, I have the majority of the work done on the spec and it will just be a matter of cleaning it up and refining my diagrams next week. I also found he UPort library, it seems like it could be a good option for handling user authentication within the application. I will look into this further next week.

Drafted sketches of some spec diagrams:

![specDiagram](https://gitlab.computing.dcu.ie/mcadamm4/2018-ca400-mcadamm4/tree/master/docs/blog/images/specDiagram1.jpg)

![specDiagram2](https://gitlab.computing.dcu.ie/mcadamm4/2018-ca400-mcadamm4/tree/master/docs/blog/images/specDiagram2.jpg)

![specDiagram3](https://gitlab.computing.dcu.ie/mcadamm4/2018-ca400-mcadamm4/tree/master/docs/blog/images/specDiagram3.jpg)

### `Done`

- ~~Complete first draft of Specification~~

### `To-Do`

- Refine Functional Specification (due next Friday)
- Investigate UPort and Web3j

---

## `Wednesday November 22, 2017`

I met with my supervisor yesterday to review the Functional spec, he was happy except I was missing hardware requirements. I finished work on the spec today by completing the schedule, high level design and fixing all the formatting.

### `Done`

- ~~Functional Spec~~

### `To-Do`

- Have hardware in hand for beginning of next semester
- Complete tutorials over the break to learn solidity and hooking an app to a blockchain network.

---

## `Friday December 15th 2017`

This last few weeks I have been very busy with assignments and have been researching what type of hardware I will need. Hoping to order soon so I will have it for the end of January.

I have also found an online book being developed by the Ethereum community on Github as a comprehensive knowledge base for developing with Ethereum and have begun reading it. I will read this over the Christmas period.

[Ethereum Builder's Guide](https://ethereumbuilders.gitbooks.io/guide/content/en/index.html)

---

## `Tuesday February 13th 2018`

Over the break I ordered and received all of the parts I need to make the locking mechanism including a "Keyduino" which is a specialized Arduino Leonardo with NFC built in. I also practiced some React Native by building an app.

### `Done`

- ~~Get parts~~

### `To-Do`

- Build react native application connected to Ethereum network
- Build Android application to communicate with Arduino
- Integrate these two applications into one

---

## `Wednesday February 22nd 2018`

So far I have built a simple application that uses the "Ethereum Android" wallet to connect to the Ethereum blockchain behind the scenes. Separate to that I have a simple React native application that shows listings for houses. My next step will be to try and integrate the functionality of both of these applications.

I have also been thinking about using Firebase for storing details about listings and other things rather than IPFS.

### `Done`

- ~~Build react native application~~
- ~~Build app connected to Ethereum network~~

### `To-Do`
- Integrate react native app with ethereum app
- Research UPort for authentication if needed
- Research Firebase for use as storage rather than IPFS
- Integrate these two applications into one

---
## `Sunday March 4th`
Over the last week and a half, I was considering making a lot of design changes which I unfortunately forgot to document here. The basic problem was doubt about handling of user accounts through the Ethereum Android wallet, I was planning on switching to the UPort framework and instead of having NFC enabled Arduinos that would unlock the items there would be a QR code sticker and when scanned with your phoned camera would provide you with a pin for unlocking the item.
The QR code part would work but UPort would not work with mobile.

I ruled out these changes and carried on with my original design, however I have decided not to use React Native as the workload and learning needed integrate Native Java code required for Ethereum Android with React Natives JavaScript outweighs the benefit of using the framework, seeing as I wont be targeting IOS I can focus on developing primarily for android.

From now on I will have more frequent and less verbose blogs documenting more granular decisions, at the moment I have a native android application that uses the Ethereum Android library to communicate with Ethereum through the Ethereum Android application.

I am now researching integration of IPFS, I cannot use Firebase as previously mentioned as this is at odds with the goal of total decentralization.

I have also started developing a testing plan.

---
## `Continuation`
I have been researching how I can identify users of the system. The technology does not yet exist to have a decentralized ID validation system whereby ID's would exist as contracts on the blockchain and could be used as a source of truth for a persons identity. Delock needs to validate a persons identity to deter robberies and fake account creation, we need to be able to concretely associate a person with an Ethereum Address.

I will look into integrating this feature using a regular api and put on record that the idea is for the system to move to a decentralized method of ID verification in the future when the software exists.

---
## `Monday March 5th`
I have been grappling with understanding why so many Dapps launched their own unique ERC20 tokens as opposed to just using Ether (The currency used to run the etehereum network). The thing is that they cannot charge fees on ether and after some research I have found that I will not require such a token as it is merely a means by which project developers introduce fees that are then used to further fund the project development. This was something I had thought would be very problematic for me and I am relived to find it does not apply.

I have also begun drafting the smart contracts for Users and Listings in order to see what functionality will need to be implemented. I intend to draw up more formal diagrams in the near future.

In terms of ID verification I cannot find a non-enterprise level API, I may have to leave this unimplemented and just say that it would be implemented in the future when the tech is there to integrate. Not having this leaves a the application open to fraud by users creating throwaway ethereum addresses I believe.

---

## `Thursday March 16th`

I have been tried to make a start on the hardware side of things, at the moment I have a separate (test app) running on my phone which is able to successfully talk to the arduino and send information. I also have created a barebones UI for the delock app using a card view structure, I decided to do some work on the UI as I really wanted to see some tangible progress. Over the next week I will work on integrating the NFC functionality into the delock app.

---

## `Sunday March 18th`
St.Patricks day was very cold but still great. Continuing on with my work on the UI I have decided to take a step backwards and look at implementing a MVP (Model, View, Presenter) type architecture so as to aid maintainability, extensibility and separation of concerns between activities. If I can manage this it should make life a lot easier down the road. In addition to this I have found a brilliant open source collection of android UI design examples which should speed up my UI/UX design and implementation significantly.

I hope to have the MVP structure set up today and can then work on getting the NFC functionality in.

### Reading: https://antonioleiva.com/mvp-android/


---

## `Thursday March 29th`
I spent quite  bit of time trying to make the MVP structure work but to no avail. I found it very hard to understand and quite different to MVC for web which I have a good bit of experience with, therefore I have scrapped that and in the time since my last blog I have implemented some basic NFC functionality and hooked up some more placeholder activity screens that need to be finished.

Now that I know the NFC if working and I have a decent proportion of the UI in place I want to start work on the smart contracts and communication with Ethereum. From reading more into Ethereum Android it looks like I may have to stop using it in favor of creating my own wallet and communicating with the blockchain via Web3j as Ethereum Android does not facilitate the deployment of smart contracts which it a big part of the application.

---

## `Sunday April 15th`

Since last I have decided to stop using Ethereum-Android wallet as I believe I can implement the needed functionality using Web3j in my own application, I have also managed to implement an IPFS daemon that will communicate with IPFS which acts as my database for pushing and pulling data, I was able to do this by using some code from an open source project called IPFSDroid on Github. My plan now is to start writing the smart contracts.

---

## `Tuesday April 17th`

The app now has a pull out drawer for viewing user info and selecting a number of options such as settings and adding new items. Today I want to implement a local wallet using Web3j and hopefully get something done with the smart contracts. I am still figuring out how the contracts will work and co-operate.

---

## `Wednesday April 18th`

I managed to get a basic wallet working today and transferred some test ether into it from my MetaMask account.
The app is showing the correct balance.
In order to execute transactions from the app the wallet generation needs to be extended to use public/private key for signing transactions.
I hope to get this done tonight or early tomorrow.

---

## `Thursday April 19th`

The code for the Android screens/activities was getting very cluttered and I did not like the duplication of code across the screens. Therefore I spent some time last night and today cleaning this up and moving the AsyncTasks out of the Activity files. The tasks were also blocking each other so I added a simple Util that extended AsyncTask and allows the threads to run in parallel on newer devices.

I have started working on the base smart contract which will be extended by every item that a user adds as a listing. They will all have base functions in common such as Rent(), Return() etc.

---

## `Tuesday April 24th`

I am continuing work on the smart contracts today, using the Truffle test framework and testRPC as a mock network for deploying and testing the contracts locally. At the moment I have the Listings.sol contract well underway. It will handle the creation and management of all listings in the app.

---

## `Wednesday April 25th`

I have refactored the layout and naming of the contracts and am working on adding functionality. A problem I think I will encounter
soon is the interaction of the different contracts with each-other when deployed. This will take a good bit of thought and time to make
sure they are all being updated properly all while trying to use as few resources as possible as each call to a function will cost Gas (cost of execution).

I have some basic functionality in the contracts so what I plan to do now is deploy them and see if I can call them from the mobile device. If this work properly then I can get back to building out the functionality of the contracts.

In order to deploy the contracts from my laptop, I have started a go-ethereum node through which I can interact with the Ethereum blockchain and deploy the contracts.

---

## `Sunday April 30th`

Contracts can now be deployed from the app. Im am working on the add item screen. I need to gather the entered data into a JSON object and save it to IPFS, then deploy a rental contract. I also have to perform the "Lock Event" whereby the owner will set the lock via NFC and the contract will mark the item as available, at the time this is done the app will need to take the device location and save it to either IPFS or to the contract so that the item location is available to renters.

In terms of schedule, I am behind by quite a bit but I feel that I will be able to get the important functionality working.

---

## `Saturday May 6th`
In the last week I have gotten the adding and retrieval of items from both IPFS and the Ethereum network to function properly. The browse screen was being populated with all available listings in the app.
For testing purposes, when thee app starts it also requests test ether from an Ethereum faucet.

In the Item screen I added a map fragment but in the course of trying to get this to work the IPFS Daemon has broken and cannot pull down any data.
This is a major problem and I will need to address it immediately.

---

## `Friday May 12th`
As it turns out, the Daemon seems to randomly timeout and I cannot fix that as it seems to be a bug in the library I am using. However I have figured out that using a regular Http request to pull down the files works in the meantime.

I managed to get the maps fragment working but there is no functionality to actually dynamically get item locations, it is just for show.

I do not intend on hooking up the physical lock to the Arduino as I do not have time.
The plan is to fix some errors with the contracts as regards conversion from Ether and Wei (the contracts work with Wei) to get proper rental and return charges when renting or returning an item.

If this is easily fixed then I can put in some minor NFC functionality and have the Arduino beep oncec for lock and twice for unlock.



[images](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet#images)
in my blog.

![cat](https://gitlab.computing.dcu.ie/sblott/2018-ca400-XXXX/raw/master/docs/blog/images/cat.jpg)

Here are the instructions:

- Add the image to your repo (probably using the `images` sub-directory here).
  The cat example above is in `./images/cat.jpg`.

- Commit that and push it to your repo.

- On Gitlab, navigate to your new image and click *Raw*.  You get the raw URL of your image.  Copy that URL.

- Add your image to this document using the following format:

    <pre>![alternative text](URL)</pre>

See the example [here](https://gitlab.computing.dcu.ie/sblott/2018-ca400-XXXX/raw/master/docs/blog/blog.md).

You can also mention other users (like me: @sblott).

## Including Code

Raw text:
```
Mary had a little lamb,
it's fleece was white as snow.
```

Syntax highlighting is also possible; for example...

Python:
```python
i = 0
while i < len(s):
   # So something.
   i = i + 1
```

Java:
```java
for (i=0; i<s.length(); i+=1) {
   // Do something.
}
```

Coffeescript:
```coffeescript
i = 0
while i < s.length
   # So something.
   i = i + 1
```

## Instructions

Once you've understood this sample, replace it with your own blog.
