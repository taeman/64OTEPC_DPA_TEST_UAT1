import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://eval.sbs-app.com:3001/menu')

WebUI.click(findTestObject('กคศ/a_'))

WebUI.setText(findTestObject('กคศ/input__form-control ng-untouched ng-dirty ng-valid'), 'Gunnoy@gmail.com')

WebUI.click(findTestObject('กคศ/div_'))

WebUI.setText(findTestObject('กคศ/input__PersonID'), '3140500015817')

WebUI.click(findTestObject('กคศ/Po'))

WebUI.click(findTestObject('กคศ/button_'))

WebUI.setText(findTestObject('กคศ/input__Telephone'), '0897456123')

WebUI.click(findTestObject('กคศ/div_'))

WebUI.click(findTestObject('กคศ/a__1'))

