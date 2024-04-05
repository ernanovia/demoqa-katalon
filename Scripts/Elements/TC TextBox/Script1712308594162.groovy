import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.time.Period

import javax.xml.ws.wsaddressing.W3CEndpointReference.Address

import org.testng.reporters.EmailableReporter

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

username = 'nona'
email = 'nonatest01@yopmail.com'
address = 'Yogyakarta'
permanentAddress = 'Sleman'

WebUI.openBrowser(GlobalVariable.base_url + 'text-box')
WebUI.maximizeWindow()
WebUI.verifyElementPresent(findTestObject('Object Repository/ElementsPage/btnSubmit'), 0)
WebUI.setText(findTestObject('Object Repository/ElementsPage/fieldUsername'), username)
WebUI.setText(findTestObject('Object Repository/ElementsPage/fieldEmail'), email)
WebUI.setText(findTestObject('Object Repository/ElementsPage/fieldAddress'), address)
WebUI.setText(findTestObject('Object Repository/ElementsPage/fieldPermanentAddress'), permanentAddress)
WebUI.click(findTestObject('Object Repository/ElementsPage/btnSubmit'))

WebUI.verifyTextPresent(username, true)
WebUI.verifyTextPresent(email, true)
WebUI.verifyTextPresent(address, true)
WebUI.verifyTextPresent(permanentAddress, true)

WebUI.closeBrowser()